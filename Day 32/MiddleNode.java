/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
    if(head.next == null) {
          return head;
       }
       if(head.next.next == null) {
          return head.next;
       }
        
        ListNode ans = head;
        ListNode twice = head;
        while(twice != null && twice.next != null)
        {
            ans = ans.next;
            twice = twice.next.next;
        }
        return ans;
    }
}