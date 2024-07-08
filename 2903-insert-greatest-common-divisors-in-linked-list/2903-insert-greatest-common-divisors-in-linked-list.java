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
    int gcd(int a,int b)
    {
        int min=Math.min(a,b);
        for(int i=min;i>=0;i--)
        {
            if(a%i==0 && b%i==0)
            {
               return i;
            }
        }
        return 0;
        
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode temp=head;
        ListNode temp1=null;
        while(temp.next!=null)
        {
            int a=temp.val;
            int b=temp.next.val;
            int c=gcd(a,b);
            ListNode p=new ListNode(c);
            temp1=temp.next;
            temp.next=p;
            p.next=temp1;
            temp=temp1;  
        }
        return head;
        
    }
}