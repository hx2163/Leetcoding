/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /*
        判断环可以使用hash table 但是空间O(n)
        或者使用双指针: 快慢指针
        */
        if(head == null) return false;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr.next != null && fastPtr.next.next != null){ //环形链表.next 不会有null的情况
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
}