class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
      //Calculate left height and then right height recursively and take max of the two and adding 1 for the current Node
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
