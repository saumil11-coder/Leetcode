class Solution {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) return new TreeNode(val, root, null);

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (depth != 2) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode n = queue.poll();

                if (n.left != null) queue.add(n.left);
                if (n.right != null) queue.add(n.right);
            }

            depth--;
        }

        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            n.left = new TreeNode(val, n.left, null);
            n.right = new TreeNode(val, null, n.right);
        }
        return root;
    }
}
