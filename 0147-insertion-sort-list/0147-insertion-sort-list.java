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
    public ListNode insertionSortList(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        int n=arr.size();
        ListNode head1=null;
        ListNode temp1=null;
        int i=0;
        while(n!=0)
        {
            ListNode p=new ListNode(arr.get(i++));
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
            n--;
        }
        return head1;
        
    }
}