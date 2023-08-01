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
    public ListNode detectCycle(ListNode head) {
        
        ListNode l = head;
        ListNode r = head;
        while(r!=null && r.next !=null) {
            l=l.next;
            r=r.next.next;
            if(l==r) {
                break;
            }
        }
        if(r==null || r.next == null) {
            return null;
        }
        
        ListNode temp = head;
        while (temp!=l) {
            temp = temp.next;
            l=l.next;
        }
        return l;
        
    }
}