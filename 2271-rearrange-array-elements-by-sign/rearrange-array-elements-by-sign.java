class Solution {
    public static void rearange(int[] nums){
        // int cons =  0,arb=1,len = nums.length;
        
        // while(arb< len)
        // {
        //     if(cons%2 == 0 && nums[cons]< 0 )
        //     {
        //         // System.out.println("even"+cons);
        //         while(arb<len){
        //             if(nums[arb]>=0)
        //             {
        //                 int temp = nums[arb];
        //                 nums[arb] = nums[cons];
        //                 nums[cons]  = temp;

        //                 ++ cons;
        //                 arb = cons+1;
        //                 break;
        //             }
        //             else
        //                 arb++;
                      
        //         }
        //     }
        //     // else if(cons%2 == 0 && nums[cons]>= 0 )
        //     // {
                
        //     // }

        //     else if(cons%2 == 1 && nums[cons] >= 0 )
            
        //     {   
        //         // System.out.println("odd"+cons);
        //         while(arb<len){
        //             if(nums[arb]<0)
        //             {
        //                 int temp = nums[arb];
        //                 nums[arb] = nums[cons];
        //                 nums[cons]  = temp;

        //                 ++ cons;
        //                 arb = cons+1;
        //                 break;
        //             }
        //             else
        //                 arb++;
                      
        //         }
        //     }

        //     else
        //     {
        //         cons ++;
        //         arb = cons+1;
        //     }

        // }

        int n = nums.length,j=0,k=0;

        int pos[] = new int[n/2];
        int neg[] = new int[n/2];

        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0)
                pos[j++] = nums[i];
            
            if(nums[i] < 0)
                neg[k++] = nums[i];
            
        }

        for(int i=0;i<n/2;i++)
        {
            nums[2*i] = pos[i];
            nums[2*i+1] = neg[i];
        }


    }


    public int[] rearrangeArray(int[] nums) {

        rearange(nums);

        return nums;

    }
}