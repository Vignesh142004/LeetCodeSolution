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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            s.push(temp.val);
            temp=temp.next;
        }
        while(head!=null && s.size()!=0)
        {
            if(s.peek()==head.val)
            {
                s.pop();
                head=head.next;
            }
            else
            {
                return false;
            }
        }
        return true;

        
    }
}