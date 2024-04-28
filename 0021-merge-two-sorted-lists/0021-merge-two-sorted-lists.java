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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1==null&&list2==null)
    {
        return null;
    }
    if(list1!=null&&list2==null)
    {
        return list1;
    }
    if(list1==null&&list2!=null)
    {
        return list2;
    }
    ListNode list3;
    if(list1.val>list2.val)
    {
       list3=list2;
       list2=list2.next;
    }
    else
    {
        list3=list1;
        list1=list1.next;
    }
    ListNode temp=list3;
    while(list1!=null&&list2!=null)
    {
        if(list1.val>list2.val)
        {
            temp.next=list2;
            list2=list2.next;
        }
        else
        {
            temp.next=list1;
            list1=list1.next;
        }
        temp=temp.next;
    }
    if(list1!=null)
    {
        temp.next=list1;
    }
    if(list2!=null)
    {
        temp.next=list2;
    }
    return list3;
        
    }
}