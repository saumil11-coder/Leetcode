/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> BigList=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
        {
            return BigList;
        }
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelNum=queue.size();
            List<Integer> subList=new ArrayList<>();
            for(int i=0;i<levelNum;i++)
            {
                if(queue.peek().left!=null)queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
                
            }
            BigList.add(subList);
        }
        return BigList;
        
    }
}