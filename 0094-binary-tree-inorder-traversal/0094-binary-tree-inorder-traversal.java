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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
    
    /* Recursive */
    
    public List<Integer> inorderTraversalRec(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        accessTree(root, res);
        return res;
    }
    
    public void accessTree(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        accessTree(root.left, res);
        res.add(root.val);
        accessTree(root.right, res);
    }
}