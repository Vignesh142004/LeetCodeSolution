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
        ListNode temp=head;
        int count=1;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        
        int size=count-n;
        ListNode temp1=head;
        int count1=1;
        while(count1<size)
        {
            
            temp1=temp1.next;
            count1++;
        }
        if(size==0)
        {
            head=temp1.next;
            return head;
        }
        if(temp1.next!=null)
        {
        temp1.next=temp1.next.next;
        }
        return head;
        

        
    }
}