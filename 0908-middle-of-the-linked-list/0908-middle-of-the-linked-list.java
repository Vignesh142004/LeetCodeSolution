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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        for(int i=0;i<count/2;i++)
        {
            head=head.next;
        }
        if(count%2!=0)
        {
            head=head.next;
        }
        return head;


        
    }
}