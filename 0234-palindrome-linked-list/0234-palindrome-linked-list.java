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
    public boolean isPalindrome(ListNode head) {
        
        ListNode p1 = head, p2 = head;
        
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        
        ListNode prev = null;
        ListNode curr = p1;
        ListNode nxt;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        while (prev != null) {
            if (prev.val == head.val) {
                head = head.next;
                prev = prev.next;
            }
            else {
                return false;
            }
        }
        return true;
        
    }
}