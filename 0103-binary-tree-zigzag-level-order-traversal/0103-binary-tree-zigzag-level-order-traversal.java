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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0; //if odd  level = right -> left; 
                     //else even level = left -> right
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> levelRes = new ArrayList<>();
            
            for(int i=0; i<len; i++){
                TreeNode temp = q.poll();
                if(temp.left != null) q.add(temp.left);             
                if(temp.right != null) q.add(temp.right);
                if(level % 2 == 0) //even level
                    levelRes.add(temp.val);
                else
                    levelRes.add(0, temp.val);
            }
            level ++;
            res.add(levelRes);
        }
        return res;

    }
}
