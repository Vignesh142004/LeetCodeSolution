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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs=new HashSet<>();
        for(int a:nums)
        {
            hs.add(a);
        }
        List<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            int p=head.val;
            if(!hs.contains(p))
            {
                arr.add(p);
            }
            head=head.next;
        }
        ListNode head1=null;
        ListNode temp=null;
        int i=0;
        int n=arr.size();
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