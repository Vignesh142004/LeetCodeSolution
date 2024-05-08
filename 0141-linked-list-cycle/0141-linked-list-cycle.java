/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer>hm=new HashMap<>();
        while(head!=null)
        {
            if(hm.containsKey(head))
            {
                return true;
            }
            else
            {
                hm.put(head,1);
                head=head.next;
            }
        }
        return false;
        
    }
}