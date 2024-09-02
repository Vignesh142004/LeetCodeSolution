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
    public ListNode deleteDuplicates(ListNode head) {
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        while(head!=null)
        {
            int a=head.val;
            if(hm.containsKey(a))
            {
                hm.put(a,hm.get(a)+1);
            }
            else
            {
                hm.put(a,1);
            }
            head=head.next;
        }
        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==1)
            {
               arr.add(m.getKey());
            }
        }
        ListNode head1=null;
        ListNode temp=null;
        int n=arr.size();
        int i=0;
        while(n>0)
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