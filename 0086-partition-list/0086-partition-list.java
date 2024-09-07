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
    public ListNode partition(ListNode head, int x) {
        List<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        List<Integer> less=new ArrayList<>();
        List<Integer> high=new ArrayList<>();
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)<x)
            {
                less.add(arr.get(i));
            }
            else
            {
                high.add(arr.get(i));
            }
        }
        less.addAll(high);
        ListNode head1=null;
        ListNode temp=null;
        int i=0;
        int len=less.size();
        while(len>0)
        {
            ListNode p=new ListNode(less.get(i++));
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
            len--;
        }
        return head1;
        
    }
}