class Solution {
    public boolean isHappy(int n) {
        int sqrsm = 0;
        // if(n > 1 && n <10)
        //     return false;
        int[] hash = new int[10000];

        while(sqrsm != 1){
            sqrsm =0;

            while(n != 0)
            {
                sqrsm += Math.pow(n%10,2);
                n /= 10;
            }
            // System.out.println(sqrsm);
            if(hash[sqrsm] == 1)
                return false;
            else
                hash[sqrsm]=1;
            n = sqrsm;
        }

        return true;
    }
}