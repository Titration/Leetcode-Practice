/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode currA = headA;
        ListNode currB = headB;

        int lenA = 0;
        int lenB = 0;

        while (currA != null) {
            currA = currA.next;
            lenA++;
        }
        while (currB != null) {
            currB = currB.next;
            lenB++;
        }
        currA = headA;
        currB = headB;

        if (lenB > lenA) {
            // swap length
            int tempLength = lenA;
            lenA = lenB;
            lenB = tempLength;
            // swap node
            ListNode tempNode = currA;
            currA = currB;
            currB = tempNode;
        }
        int diff = lenA - lenB;
        while (diff > 0) {
            currA = currA.next;
            diff--;
        }
        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }
}