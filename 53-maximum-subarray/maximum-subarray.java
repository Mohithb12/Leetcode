class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE,sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];

            if(maxSum < sum)
                maxSum = sum;

            if(sum < 0)
                sum =0;
        }
        
        return maxSum;

        

    }
}