class Solution {
    
    static int maxRob(int ind,int[] nums,int[] dp)
    {
        if(ind == 0) return nums[0];

        if(ind == -1) return 0;

        if(dp[ind] != -1) return dp[ind];

        int pick = maxRob(ind -2,nums,dp) + nums[ind];

        int notpick = maxRob(ind -1 , nums,dp);

        return dp[ind] = Math.max(pick , notpick);

    }
    
    public int rob(int[] nums) {
         int n = nums.length;
         int[] dp = new int[n]; 

         Arrays.fill(dp,-1);

         return maxRob(n-1,nums,dp);

    }
}