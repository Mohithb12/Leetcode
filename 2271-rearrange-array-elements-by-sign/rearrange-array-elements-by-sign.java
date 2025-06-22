class Solution {
    // public static int[] rearange(int[] nums){
    //     // int cons =  0,arb=1,len = nums.length;
        
    //     // while(arb< len)
    //     // {
    //     //     if(cons%2 == 0 && nums[cons]< 0 )
    //     //     {
    //     //         // System.out.println("even"+cons);
    //     //         while(arb<len){
    //     //             if(nums[arb]>=0)
    //     //             {
    //     //                 int temp = nums[arb];
    //     //                 nums[arb] = nums[cons];
    //     //                 nums[cons]  = temp;

    //     //                 ++ cons;
    //     //                 arb = cons+1;
    //     //                 break;
    //     //             }
    //     //             else
    //     //                 arb++;
                      
    //     //         }
    //     //     }
    //     //     // else if(cons%2 == 0 && nums[cons]>= 0 )
    //     //     // {
                
    //     //     // }

    //     //     else if(cons%2 == 1 && nums[cons] >= 0 )
            
    //     //     {   
    //     //         // System.out.println("odd"+cons);
    //     //         while(arb<len){
    //     //             if(nums[arb]<0)
    //     //             {
    //     //                 int temp = nums[arb];
    //     //                 nums[arb] = nums[cons];
    //     //                 nums[cons]  = temp;

    //     //                 ++ cons;
    //     //                 arb = cons+1;
    //     //                 break;
    //     //             }
    //     //             else
    //     //                 arb++;
                      
    //     //         }
    //     //     }

    //     //     else
    //     //     {
    //     //         cons ++;
    //     //         arb = cons+1;
    //     //     }

    //     // }

    //     int n = nums.length,j=0,k=0;
    //     int[] result = new int[n];

    //     for(int i=0;i<n;i++)
    //     {
    //         if(nums[i] > 0)
    //         {    
    //             result[j] = nums[i];
    //             j +=2;
               
    //         }    
            
    //         if(nums[i] < 0)
    //         {
    //             result[k] = nums[i];
    //             k +=2;
    //         }
    //     }

        
    //     return result;

    // }


    public int[] rearrangeArray(int[] nums) {

        int n = nums.length,j=0,k=1;
        int[] result = new int[n];

        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0)
            {    
                result[j] = nums[i];
                j +=2;
               
            }    
            
            if(nums[i] < 0)
            {
                result[k] = nums[i];
                k +=2;
            }
        }
        
        return result;

        

    }
}