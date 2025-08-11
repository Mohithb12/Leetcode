class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int notleave = maxProfit(nums,0,n-2);
        int leave = maxProfit(nums,1,n-1);

        return Math.max(leave,notleave);

        
    }

    static int maxProfit(int[] nums,int start,int end)
    {
        int prev=0,prev2=0;

        

        for(;start<=end;start++)
        {
            int cur = Math.max(prev,prev2+nums[start]);

            prev2 = prev ;
            prev = cur;
        }

        return prev;
    }
}