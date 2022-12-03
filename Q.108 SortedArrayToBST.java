public TreeNode sortedArrayToBST(int[] nums) {
            return helper(nums, 0, nums.length - 1);
    }
    public static TreeNode helper(int[] nums, int start, int end) {
        if (start > end) return null;
        // On each call of the helper function we keep going by picking the mid element as a node of the remaining part of the array
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid - 1);
        node.right = helper(nums, mid + 1, end);
        return node;
    }
