/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        //base case: 
        if(head == null) return null;
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        if (head.next.next == null) {
            return new TreeNode(head.next.val, new TreeNode(head.val), null);
        }
        
        ListNode prev = null, slow = head, fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        //left part is treenode's left
        //right part is treenode's right
        TreeNode res = new TreeNode(slow.val);
        res.right = sortedListToBST(slow.next);
        res.left = sortedListToBST(head);
        return res;
        
        
    }
}