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
    public ListNode swapPairs(ListNode head) {
          if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode tempi=head;
        ListNode tempj=head.next;
      

        while(tempj.next!=null && tempj.next.next!=null ){
            swap(tempi,tempj);
            tempi= tempj.next;
            tempj=tempj.next.next;
        }
         swap(tempi,tempj);
        return head;
    }

    public static void swap(ListNode tempi, ListNode tempj){
            int temp= tempi.val;
            tempi.val=tempj.val;
            tempj.val=temp;
    }
}