class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0,min=0;
        for(int i=0,j=nums.length -1;i < k;i++,j--){
            min += nums[i];
            max += nums[j];
        }

        return Math.abs(max-min);

    }
}