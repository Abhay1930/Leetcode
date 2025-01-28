class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            List<Integer> subLevels = new ArrayList<>();
            int cnt = queue.size();
            
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                subLevels.add(node.val);
                
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            
            res.add(subLevels);
        }
        
        return res;
    }
}
