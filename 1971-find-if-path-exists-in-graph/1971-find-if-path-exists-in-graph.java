class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int[] a: edges){
            int u=a[0];
            int v=a[1];
            map.putIfAbsent(u, new ArrayList<>());
            map.get(u).add(v);
            map.putIfAbsent(v, new ArrayList<>());
            map.get(v).add(u);
        }
        // System.out.println(map);
        Set<Integer> visited=new HashSet<>();
        Queue<Integer> queue=new LinkedList<>();
        queue.add(source);
        visited.add(source);
        while(!queue.isEmpty()){
            int curr=queue.poll();
            if(curr==destination) return true;
            List<Integer> ls=map.get(curr);
            for(int val: ls){
                if(!visited.contains(val)){
                    queue.add(val);
                    visited.add(val);
                }
            }
        }
        return visited.contains(destination);
    }
}