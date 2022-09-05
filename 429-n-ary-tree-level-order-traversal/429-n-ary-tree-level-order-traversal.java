class Solution {

public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> ans=new ArrayList<List<Integer>>();
    if(root==null)
        return ans;
    Queue<Node> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty())
    {
        int p=queue.size();
        ArrayList<Integer> k=new ArrayList<>();
        for(int i=0;i<p;i++)
        {
            k.add(queue.peek().val);
            for(Node f:queue.peek().children)
            {
                queue.offer(f);
            }
            queue.poll();
        }
        ans.add(new ArrayList<>(k));
    }
    return ans;
}
}