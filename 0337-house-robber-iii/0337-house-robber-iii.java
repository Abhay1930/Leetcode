class Solution {
    public int rob(TreeNode root) {
        int answer[] = helper(root);
        return Math.max(answer[0], answer[1]);
    }

    public int[] helper(TreeNode node) {
        if ( node == null) {
            return new int[]{0, 0};
        }

        int left[] = helper(node.left);
        int right[] = helper(node.right);
        
        int rob = node.val + left[1] + right[1]; 
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{ rob, notRob}; 
    }
}
