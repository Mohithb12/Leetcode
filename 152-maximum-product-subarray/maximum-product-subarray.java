class Solution {
    public int maxProduct(int[] nums) {
        int  max = nums[0], product=nums[0];
        // int j=0;
        // for(int i=1;i<nums.length;i++)
        // {   
        //     product *= nums[i];

        //     if(nums[i] > product)
        //         product = nums[i];

        //     if(product > max )
        //         max = product;
            
        // }

        for(int i=0;i<nums.length;i++){
            product = nums[i];
            max = max > product ? max:product;
            for(int j=i+1;j<nums.length;j++)
            {
                product *= nums[j];

                max = max > product ? max:product;
            } 
}
        return max;
    }
}