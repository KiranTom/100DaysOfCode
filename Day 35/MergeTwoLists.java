/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null) {
            return l2;
        } 
        else if(l2 == null) {
            return l1;
        }
        int count = 1 ;
        ListNode head = new ListNode(0);
        ListNode dup = head;
        while(l1!=null && l2!=null) {
            
            if (l1.val<=l2.val){
                if(count == 1) {
                    head.val = l1.val;
                    count++;
                    l1=l1.next;
                }
                else {
                    ListNode n = new ListNode(0);
                    n.val = l1.val;
                    dup.next = n;
                    dup = dup.next;
                    l1=l1.next;
                }
            }
            else {
                if(count == 1) {
                    head.val = l2.val;
                    count++;
                    l2=l2.next;
                }
                else {
                    ListNode n = new ListNode(0);
                    n.val = l2.val;
                    dup.next = n;
                    dup = dup.next;
                    l2=l2.next;
                }
                
            }
        }
        if(l1!=null) {
            dup.next=l1;
        }
        else if(l2 != null) {
            dup.next=l2;
        }
        return head;
    }
}