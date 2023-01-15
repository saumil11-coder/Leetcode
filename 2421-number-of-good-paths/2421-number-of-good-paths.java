
class Solution {
    private int find(int[] dsu, int node) {
        if(dsu[node] == node) return node;
        
        return dsu[node] = find(dsu, dsu[node]); // path compression
    }
    
    private void union(int[] dsu, int node1, int node2) {
        int r1 = find(dsu, node1);
        int r2 = find(dsu, node2);
        dsu[r2] = r1;
    }
    

    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        Map<Integer, List<Integer>> tree = new HashMap<>();
        int n = vals.length;
        int[] dsu = new int[n];
        int ans = 0;
        
        Map<Integer, List<Integer>> valToNodes = new HashMap<>();
        for (int i = 0; i < n; i++) {
            dsu[i] = i;
            
            tree.put(i, new ArrayList<>());
            int val = vals[i];
            valToNodes.computeIfAbsent(val, k -> new ArrayList<>()).add(i);
        }

        for (int[] edge : edges) {
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        for(int val : valToNodes.keySet().stream().sorted().toList()) {
            // process the nodes with the smallest values first
            for(int node : valToNodes.get(val)) {
                if(visited.contains(node)) continue;
                visited.add(node);
                
                mergeComponents(tree, node, visited, vals, dsu);
            }

            Map<Integer, Integer> rootCompFreq = new HashMap<>();
            for(int node : valToNodes.get(val)) {
                int root = find(dsu, node);
                rootCompFreq.put(root, rootCompFreq.getOrDefault(root, 0) + 1);
            }
            
            // nC2 combination
            for(int nodeCount : rootCompFreq.values()) {
                ans += (((nodeCount + 1) * nodeCount) / 2);
            }
        }

        return ans;
    }

    private void mergeComponents(Map<Integer, List<Integer>> tree, int node, Set<Integer> visited, int[] vals, int[] dsu) {
        for(int neighbor : tree.get(node)) {
            if(vals[neighbor] > vals[node]) continue;
            
            union(dsu, node, neighbor);

            if(visited.contains(neighbor)) continue;
            visited.add(neighbor);
            mergeComponents(tree, neighbor, visited, vals, dsu);
        }
    }
}