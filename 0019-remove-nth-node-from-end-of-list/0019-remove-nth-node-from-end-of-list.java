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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        
        ListNode cur1=head;
        ListNode cur2=head;
        for(int i=0;i<n;i++){
            cur2=cur2.next;
        }
        if(cur2==null)return head.next;
        while(cur2.next!=null){
            cur2=cur2.next;
            cur1=cur1.next;
        }
         cur1.next=cur1.next.next;
        
        return head;
        
    }
}