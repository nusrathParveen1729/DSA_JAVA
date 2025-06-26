class Solution {
    public int longestConsecutive(int[] nums) {
        int longseq = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : nums){
            hs.add(i);
        }
        for(int i:hs){
            if(!hs.contains(i-1)){
                int currNum = i;
                int currseq = 1;
            
            while(hs.contains(currNum+1)){
                currNum++;
                currseq++;
            }
            longseq = Math.max(currseq,longseq); 
        }
        }
        return longseq;
    }
}
