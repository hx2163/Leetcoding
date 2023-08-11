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
    public boolean isSymmetricRec(TreeNode root) {
        if(root == null) return true;
        return deepCheck(root.left, root.right);
    }
    
    boolean deepCheck(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return deepCheck(left.left, right.right) && deepCheck(left.right, right.left);
    }
    
    /*Queue */
    
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode> ();
        TreeNode l = root.left;
        TreeNode r = root.right;
        if(root == null || (l == null && r == null)){
            return true;
        }
        q.offer(l);
        q.offer(r);
        while(!q.isEmpty()){
            l = q.poll();
            r = q.poll();
            if(l == null && r == null){
                continue;
            }
            if((l == null || r == null) || (l.val != r.val)){
                return false;
            }
            q.offer(l.left);
            q.offer(r.right);
            
            q.offer(l.right);
            q.offer(r.left);
        }
        return true;    
    }
    
}