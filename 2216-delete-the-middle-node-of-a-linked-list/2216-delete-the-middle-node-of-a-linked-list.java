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
    public ListNode deleteMiddle(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        int i=0;
        int j=arr.size();
        int mid=(i+j)/2;
        arr.remove(mid);
        ListNode head1=null;
        ListNode temp=null;
        for(int a=0;a<arr.size();a++)
        {
            ListNode p=new ListNode(arr.get(a));
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