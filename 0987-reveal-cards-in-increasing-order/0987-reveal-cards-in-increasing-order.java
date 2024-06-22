class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        int ans[]=new int[n];
        Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            q.add(i);
        }
        for(int i=0;i<n;i++)
        {
            ans[q.peek()]=deck[i];
            q.remove();
            q.add(q.poll());
        }
        return ans;
    

        
    }
}