class Solution {
    public boolean isHappy(int n) {
        int sqrsm = 0;
        
        int[] hash = new int[1000];

        while(sqrsm != 1){
            sqrsm =0;

            while(n != 0)
            {
                sqrsm += Math.pow(n%10,2);
                n /= 10;
            }
            
            if(hash[sqrsm] == 1)
                return false;
            else
                hash[sqrsm]=1;
            n = sqrsm;
        }

        return true;
    }
}