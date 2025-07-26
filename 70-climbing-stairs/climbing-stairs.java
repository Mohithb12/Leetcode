class Solution {
    public int climbStairs(int n) {
        
        
        // HashMap<Integer,Integer> map = new HashMap<>();
        // ArrrayList<Integer> arr = new ArrayList<>();
        int[] dp = new int[n+1]; 
        for(int i=0;i<n+1;i++)
        {
            dp[i] = -1;
        }

        return stepCount(dp,n);
        // return res;

    }

    static int stepCount(int[] dp,int n){
        if(n==0 || n==1)
            return 1;

        if(dp[n] == -1)
        {   
            int left = stepCount(dp,n-1);
            int right = stepCount(dp,n-2);
            dp[n] = left+right;
        }

        return dp[n];

    }
    
}