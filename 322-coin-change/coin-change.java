class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp =new int[coins.length][amount+1];

        for(int[] rows:dp)
        {
            Arrays.fill(rows,-1);
        }

        int res=fewest(coins,coins.length -1,amount,dp);
        return res >= (int)1e9 ? -1 : res;

    }

    static int fewest(int[] coins,int ind,int amount,int[][] dp)
    {
        if(ind == 0){
            if( amount % coins[0] == 0) 
                return amount/coins[0];

            return (int)1e9;
        }

        if(dp[ind][amount] != -1) return dp[ind][amount];
        
        int take=(int)1e9;
        if(coins[ind] <= amount)
            take = 1 + fewest(coins,ind,amount - coins[ind],dp);

        int nottake = fewest(coins,ind-1,amount,dp);

        return dp[ind][amount]=Math.min(take,nottake);

        
    }
}