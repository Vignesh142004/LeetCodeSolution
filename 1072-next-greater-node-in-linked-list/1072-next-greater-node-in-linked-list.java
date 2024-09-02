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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        int ans[]=new int[arr.size()];
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            int val=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr.get(j)>arr.get(i))
                {
                    val=arr.get(j);
                    break;
                }
            }
            ans[i]=val;
        }
        return ans;
        
    }
}