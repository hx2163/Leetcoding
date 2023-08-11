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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        
        while(root != null || !stack.isEmpty()){
            while(root != null){
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return res;
    }
    
   /*Recursive */
    
    public List<Integer> preorderTraversalRec(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        accessTree(root,res);
        return res;
    }
    
    public void accessTree(TreeNode root, List<Integer> res){
        if(root == null) 
            return;
        res.add(root.val);
        accessTree(root.left, res);
        accessTree(root.right, res);
    }
}