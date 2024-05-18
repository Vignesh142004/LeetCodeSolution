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
    public int getDecimalValue(ListNode head) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            s1.push(temp.val);
            temp=temp.next;
        }
        while(s1.size()!=0)
        {
            s2.push(s1.peek());
            s1.pop();
        }
        String s="";
        while(s2.size()!=0)
        {
           s=s+s2.pop();
        }
        int ans=Integer.parseInt(s,2);
        return ans;
        
    }
}