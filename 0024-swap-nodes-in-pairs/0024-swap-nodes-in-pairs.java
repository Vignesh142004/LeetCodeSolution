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
    public ListNode swapPairs(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        int len=arr.size();
        for(int i=0;i<len-1;i=i+2)
        {
            int temp=arr.get(i);
            arr.set(i,arr.get(i+1));
            arr.set(i+1,temp);
        }
        ListNode head1=null;
        ListNode temp=null;
        for(int i=0;i<len;i++)
        {
            ListNode p=new ListNode(arr.get(i));
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