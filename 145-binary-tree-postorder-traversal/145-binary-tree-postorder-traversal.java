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
  public List<Integer> postorderTraversal(TreeNode root) {
Stack<TreeNode> st=new Stack<>();
List<Integer> bigList=new ArrayList<>();
if(root==null)
{
return bigList;
}
TreeNode current=root;
while(current!=null || !st.isEmpty())
{if(current!=null){
st.push(current);
current=current.left;
}
else{
TreeNode temp= st.peek().right;
if(temp==null){
temp=st.pop();
bigList.add(temp.val);
while(!st.isEmpty()&& temp==st.peek().right)
{
temp=st.pop();
bigList.add(temp.val);
}
}
else{
current=temp;
}
}
}
return bigList;


        
}

}