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
    public ListNode find_MidNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } 
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        if(head.next.next==null){
            return head.val+head.next.val;
        }
        ListNode right=find_MidNode(head);
        right=reverse(right);
        ListNode left=head;
        int max=0;
        while(right!=null){
            max=Math.max(left.val+right.val,max);
            left=left.next;
            right=right.next;
        }
        return max;
    }
}