class Solution {
    public int countPrimeSetBits(int left, int right) {
        int total_prime = 0;

        for(int i=left; i<=right; i++){
            int n = i;
            int count_bit = 0;
            while(n != 0){
                if((n & 1) == 1){
                    count_bit++;
                    n >>= 1;
                }
                else n >>= 1;
            }
            boolean prime = count_bit >= 2;

            for(int j=2; j*j<=count_bit; j++){
                if(count_bit % j == 0){
                    prime = false;
                    break;
                }
                
            }
             if(prime){
                    total_prime++;
                }
        }
        return total_prime;
    }
}