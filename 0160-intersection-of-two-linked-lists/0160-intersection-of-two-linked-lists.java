/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       /* Stack<ListNode> s1=new Stack<>();
        Stack<ListNode> s2=new Stack<>();
        while(headA!=null)
        {
           s1.push(headA);
           headA=headA.next;
        }
        while(headB!=null)
        {
            s2.push(headB);
            headB=headB.next;
        }
        ListNode ans=null;
        while(s1.size()!=0&&s2.size()!=0)
        {
            if(s1.peek()==s2.peek())
            {
                ans=s1.pop();
                s2.pop();
                continue;
            }
        }
        return ans;*/
        HashMap<ListNode,Integer>hm=new HashMap<>();
        while(headA!=null)
        {
            hm.put(headA,1);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(hm.containsKey(headB))
            {
                return headB;
            }
            else
            {
                headB=headB.next;
            }
        }
        return null;

        
    }
}