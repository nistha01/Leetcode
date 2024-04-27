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
        if(head==null)return false;
        if(head.val==Integer.MAX_VALUE && head.next!=null)return true;
        else if(head.next==null && head.val!=Integer.MAX_VALUE)return false;
        head.val=Integer.MAX_VALUE;
       return hasCycle(head.next);
    }
}