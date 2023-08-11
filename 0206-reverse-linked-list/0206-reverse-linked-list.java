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
    /*
    preNode to store previous node
    */
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next; //先保存当前节点的下一个指向
            curr.next = preNode; //把当前节点改为指向前一个节点
            preNode = curr; //preNode ++
            curr = nextNode; //curr ++
        }
        return preNode;
    }
}