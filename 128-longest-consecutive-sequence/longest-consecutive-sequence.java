class Solution {
    public int longestConsecutive(int[] nums) {
        int n =nums.length,max=1;

        //    Brute Force

        /*
        int cnt,x;

        if (n==0)
            return 0;

        for(int i=0;i<n;i++)
        {
            cnt = 1;
            x = nums[i];

            for(int j=0;j<n;j++)
            {
                if((x+1) == nums[j])
                {   
                    j=-1;
                    x = x+1;
                    cnt++ ;
                }
            }

            max = max>cnt? max :cnt;

        } */

        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        if(n == 0) return 0;
        int cnt=1,x=nums[0];
        

        for(int i=1;i<n;i++)
        {
            if(x+1 == nums[i])
            {
                cnt ++;
                x++;
            }
            else if(x != nums[i])
            {
                max = max > cnt ? max: cnt;
                cnt =1;
                x = nums[i];
            }
        }

        max = cnt > max? cnt : max;
        return max;
    }
}