class Solution {

    static int minCoins(int ind,int amount,int[] coins,HashMap<String,Integer> map) {

        if(ind == 0){
            if(amount % coins[0] == 0)
                return amount/ coins[0];
            
            return (int) 1e9;
        }

        String key = ind + "-" + amount;

        if(!map.containsKey(key)){
        int left = (int) 1e9;
        if(coins[ind] <= amount)
             left = 1 + minCoins(ind,amount - coins[ind],coins,map);

        int right = minCoins(ind-1,amount,coins,map);

        map.put(key,Math.min(left,right));

        }

        return map.get(key); 
    }

    public int coinChange(int[] coins, int amount) {
        
        HashMap<String,Integer> map = new HashMap<>();
        
        int ans = minCoins(coins.length-1,amount,coins,map);

        return (ans >= (int) 1e9) ? -1 : ans;


    }
}