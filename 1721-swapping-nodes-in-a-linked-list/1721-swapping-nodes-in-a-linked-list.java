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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head, fast = head;
        ListNode a = head, b = head;
        
        for(int i = 1; i < k; i++){
            fast = fast.next;
        }
        a = fast;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        b = slow;
        
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
        
        return head;
        
    }
}