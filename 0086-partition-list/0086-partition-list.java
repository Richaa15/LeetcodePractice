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
public class Solution {
    public ListNode partition(ListNode head, int x) {
        // Create two new dummy nodes to act as the heads of the 'before' and 'after' partitions.
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        
        // Create pointers to keep track of the current positions in the 'before' and 'after' partitions.
        ListNode before_curr = before;
        ListNode after_curr = after;
        
        // Traverse the original linked list.
        while (head != null) {
            if (head.val < x) {
                // If the current node's value is less than 'x', add it to the 'before' partition.
                before_curr.next = head; // Connect the current node to the 'before' partition.
                before_curr = before_curr.next; // Move the 'before' partition pointer.
            } else {
                // If the current node's value is greater than or equal to 'x', add it to the 'after' partition.
                after_curr.next = head; // Connect the current node to the 'after' partition.
                after_curr = after_curr.next; // Move the 'after' partition pointer.
            }
            
            // Move to the next node in the original linked list.
            head = head.next;
        }
        
        // Terminate the 'after' partition by setting its last node's 'next' pointer to null.
        after_curr.next = null;
        
        // Connect the end of the 'before' partition to the beginning of the 'after' partition.
        before_curr.next = after.next;
        
        // The result is the modified 'before' partition, excluding the dummy node.
        return before.next;
    }
}
