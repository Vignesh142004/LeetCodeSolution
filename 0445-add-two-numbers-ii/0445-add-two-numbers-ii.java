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
        List<Integer> ans=new ArrayList<>();
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
        int i=arr1.size()-1;
        int j=arr2.size()-1;
        int carry=0;
        while(i>=0 && j>=0)
        {
            int val=arr1.get(i--)+arr2.get(j--)+carry;
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
        while(i>=0)
        {
            int val=arr1.get(i--)+carry;
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
        while(j>=0)
        {
            int val=arr2.get(j--)+carry;
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
        if(carry==1)
        {
            ans.add(1);
        }
        int len=ans.size();
        ListNode head=null;
        ListNode temp=null;
        for(int a=len-1;a>=0;a--)
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