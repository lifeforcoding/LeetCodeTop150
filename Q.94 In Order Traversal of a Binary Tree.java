// Using Recursive stack
public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }
    public static void helper(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        helper(root.left,ans);
        ans.add(root.val);
        helper(root.right,ans);
    }

//Usint Iterative method
public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            ans.add(current.val);
            current = current.right;
        }
        return ans;
    }
