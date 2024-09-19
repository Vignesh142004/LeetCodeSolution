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
    public ListNode sortList(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        Collections.sort(arr);
        int n=arr.size();
        ListNode head1=null;
        ListNode temp=null;
        int i=0;
        while(n!=0)
        {
            ListNode p=new ListNode(arr.get(i++));
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
            n--;
        }
        return head1;
        
    }
}