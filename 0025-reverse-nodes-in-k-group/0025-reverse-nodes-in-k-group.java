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
    static void swap(List<Integer> arr,int i,int j)
    {
        while(i<=j)
        {
           int temp=arr.get(i);
           arr.set(i,arr.get(j)); 
           arr.set(j,temp);
           i++;
           j--;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
            count++;
        }
        if(k>count)
        {
            return head;
        }
        for(int i=0;i+k<=count;i=i+k)
        {
            swap(arr,i,i+k-1);
        }
        ListNode head1=null;
        ListNode temp1=null;
        for(int i=0;i<count;i++)
        {
            ListNode p=new ListNode(arr.get(i));
            if(head1==null)
            {
                head1=p;
                temp1=p;
            }
            else
            {
                temp1.next=p;
                temp1=temp1.next;
            }
        }
        return head1;
        
    }
}