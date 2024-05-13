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
    public ListNode reverseList(ListNode head) {
        Stack<Integer>st=new Stack<>();
        while(head!=null)
        {
            st.push(head.val);
            head=head.next;
        }
        ListNode head1=null;
        ListNode temp=null;
        while(st.size()!=0)
        {
            ListNode p=new ListNode(st.pop());
            if(head1==null)
            {
                head1=p;
                temp=p;
            }
            else
            {
                 temp.next=p;
                temp=temp.next;
               
                
            }
        }
        return head1;

        
    }
}