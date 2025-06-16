class Solution {
    public int majorityElement(int[] nums) {

        // Brute force

    //         int flag = 0;
    // for (int i = 0; i < nums.length - 1; i++) {
    //   for (int j = 0; j < nums.length - i - 1; j++) {

    //     if (nums[j] > nums[j + 1]) {
    //       flag = 1;
    //       int temp = nums[j];
    //       nums[j] = nums[j + 1];
    //       nums[j + 1] = temp;
    //     }

    //   }
    //   if (flag == 0) {
    //     break;
    //   }

    // }
    //     return nums[nums.length/2];


        //Beter

    // HashMap<Integer,Integer> hash = new HashMap<>();

    // for(int i=0;i<nums.length;i++)
    // {
    //     if(hash.containsKey(nums[i]))
    //     {   
    //         int value = hash.get(nums[i]);
    //         hash.put(nums[i],value +1);
    //     }
    //     else
    //         hash.put(nums[i],1);
    // }

    // for(Map.Entry<Integer,Integer> it : hash.entrySet())
    // {
    //     if(it.getValue()> nums.length/2)
    //         return it.getKey();
    // }
    // return -1;

        //Optimal

    int elem=0,count=0,len = nums.length;

    for(int i=0;i<len;i++)
    {
        if(count == 0)
        {   count = 1;
            elem = nums[i];
        }
        else if(elem == nums[i])
            ++ count;
        else if(elem != nums[i])
            -- count;
    }

    return elem;
     

    }
}