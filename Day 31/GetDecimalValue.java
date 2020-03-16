/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        ListNode copy = head;
        int size = -1, result = 0;
    
        if(head == null)        
            return 0;
        
        while(head != null)
        {
            size++;
            head = head.next;
        }
        
        while(copy != null)
        {
            result += copy.val * Math.pow(2, size--);
            copy = copy.next;
        }
        return result;
    }
}