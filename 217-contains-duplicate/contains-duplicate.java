class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> maps = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(maps.containsKey(nums[i]))
            {   
                int value = maps.get(nums[i]);
                maps.put(nums[i],value+1);
            }
            else
            {
                maps.put(nums[i],0);
            }
        }

        for(int i=0;i<n;i++)
        {
            if(maps.get(nums[i]) >0 )
                return true;
        }

        return false;
        
    }
}