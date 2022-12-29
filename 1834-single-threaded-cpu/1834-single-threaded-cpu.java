class Solution {
    class Node {
        int[] task;
        int index;
        Node(int[] t, int i) {
            task = t; index = i;
        }
        
        public String toString() {
            return Arrays.toString(task) + " : " + index;
        }
    }
    
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] res = new int[n];
           
        Node[] nodes = new Node[n];
        
		// store tasks with its original index
        for(int i=0; i<n; i++) {
            nodes[i] = new Node(tasks[i], i);
        }
        
        Arrays.sort(nodes, new Comparator<Node>(){
            @Override
            public int compare(Node n1, Node n2) {
                return n1.task[0] == n2.task[0]? n1.index - n2.index : n1.task[0] - n2.task[0];
            }
        });
     
        PriorityQueue<Node> pq = new PriorityQueue<Node>(new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                return n1.task[1] == n2.task[1]? n1.index - n2.index : n1.task[1] - n2.task[1];
            }
        });
        int time = nodes[0].task[0];
        int i=0, j=0;
     
        while(i<n) {    
            if(pq.isEmpty() && time < nodes[i].task[0]) {
                pq.offer(nodes[i]);
                time = nodes[i].task[0];
                i++;
            }
            while(i<n && nodes[i].task[0] <= time) {
                pq.offer(nodes[i]);
                i++;
            }
            Node node = pq.poll();
            res[j++] = node.index;
            time += node.task[1];
        }
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            res[j++] = node.index;
        }
        return res;
    }
}