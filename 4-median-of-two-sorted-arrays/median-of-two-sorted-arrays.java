class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int l1 = nums1.length , l2 =nums2.length;
        

        int i=0,j=0,k=0;

        int[] arr = new int[l1+l2];

        while(i < l1 && j < l2){
            
            if(nums1[i] < nums2[j])
            {
                arr[k++] = nums1[i++];
            }

            else
                arr[k++] = nums2[j++];

        }

        while(i < l1)
        {
            arr[k++] = nums1[i++];
        }

        while(j < l2)
            arr[k++] = nums2[j++];

        if((l1+l2) %2 != 0)
            return  (float)arr[(l1+l2)/2];

        else{
            int sum = l1+l2;
            return (float) (arr[sum/2] + arr[sum/2 -1]) /2;
        }
        


    }
}