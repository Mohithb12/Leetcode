class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int[][] hash = new int[nums.length][nums.length+1];
        for(int[] row : hash)
            Arrays.fill(row,-1);
        return LIS(nums,0,-1,hash);
      
    }

    static int LIS(int[] nums,int ind,int prev,int[][] hash){
        if(ind == nums.length)
            return 0;
        
        if(hash[ind][prev+1] != -1) return hash[ind][prev+1];
        int left=0;
        if( prev == -1 || nums[ind] > nums[prev])
             left = 1 + LIS(nums,ind +1,ind,hash);
        
        
           int right = LIS(nums,ind+1,prev,hash);

        return hash[ind][prev+1]=Math.max(left,right);
    }
}