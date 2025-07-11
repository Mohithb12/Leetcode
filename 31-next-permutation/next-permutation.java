class Solution {
    public void nextPermutation(int[] nums) {
        
        // int i = nums.length -1  , j = i - 1;
        // int flag = -1;

        // for(;j>=0;j--)
        // {
        //     if(nums[j] < nums[i])
        //     {
        //         int temp = nums[i];
        //         while(i > j)
        //         {
        //             nums[i] = nums[i-1];
        //             i--;

        //         }
        //         nums[j] = temp;
        //         flag=0;
        //         break;
        //     }
        // }

        // i = 0 ; j =nums.length-1;

        // if(flag == -1)
        // {
        //     while(i<j)
        //     {
        //        nums[i] = nums[i] + nums[j];
        //         nums[j] = nums[i] - nums[j];
        //         nums[i] = nums[i] - nums[j]; 
        //         i++;
        //         j--;
        //     }
        // }

        int index = -1;
        int n= nums.length;

        for(int i = n-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                index = i;
                break;
            }
        }

        if(index == -1)
            reverse(nums,0,n-1);

        else{

        for(int i=n-1;i>index;i--)
        {
            if(nums[i] > nums[index] )
            {
                nums[i] = nums[i] + nums[index];
                nums[index] = nums[i] - nums[index];
                nums[i] = nums[i] - nums[index];
                break;
            }
        }
            reverse(nums,index+1,n-1);
        }

    }

    public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start++] = nums[end];
        nums[end--] = temp;
    }
}

    
}