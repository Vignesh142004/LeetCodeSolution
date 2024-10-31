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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        while(l1!=null)
        {
            arr1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null)
        {
            arr2.add(l2.val);
            l2=l2.next;
        }
        int carry=0;
        int i=0;
        int j=0;
        int n=arr1.size();
        int m=arr2.size();
        List<Integer> ans=new ArrayList<>();
        while(i<n && j<m)
        {
            int val=arr1.get(i++)+arr2.get(j++)+carry;
            if(val>9)
            {
                ans.add(val%10);
                carry=1;
            }
            else
            {
                carry=0;
                ans.add(val);
            }
        }
        while(i<n)
        {
            int val=arr1.get(i++)+carry;
            if(val>9)
            {
                ans.add(val%10);
                carry=1;
            }
            else
            {
                ans.add(val);
                carry=0;
            }
        }
        while(j<m)
        {
            int val=arr2.get(j++)+carry;
            if(val>9)
            {
                ans.add(val%10);
                carry=1;
            }
            else
            {
                carry=0;
                ans.add(val);

            }
        }
        if(carry==1)
        {
            ans.add(1);
        }
        ListNode head=null;
        ListNode temp=null;
        int len=ans.size();
        for(int a=0;a<len;a++)
        {
            ListNode p=new ListNode(ans.get(a));
            if(head==null)
            {
                head=p;
                temp=p;
            }
            else
            {
                temp.next=p;
                temp=temp.next;
            }
        }
        return head;



        
    }
}