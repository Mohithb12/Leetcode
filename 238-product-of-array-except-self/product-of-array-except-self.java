class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int prod=  1 ,prod1=1;
        int[] res = new int[n];
        for(int i=0;i<n;i++)
        {
            prod *= nums[i];
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
                res[i] = prod / nums[i];
            else
            {    for(int j=0;j<n;j++)
                {
                    if(i==j)
                        continue;
                    else
                     {   prod1 *= nums[j];
                        res[i] = prod1;}
                }
            }
        }

        return res;
    }
}