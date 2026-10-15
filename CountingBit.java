class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i=1; i<n+1; i++){
         int count = 0;
         int bit = i;
        while(bit>0){
            if((bit & 1) == 1){
                count = count + 1;
                bit = bit >> 1;
            }
            else
            bit = bit>>1;
        }
        ans[i] = count;
        }
       
        return ans;
    }   
    }