class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int jmp = Math.ceil((n+m)/2);
        int i=m-1,j=n-1,k= nums1.length-1;
        if(m == 0){
            for(int x =0;x< n;x++){
                nums1[x] = nums2[x];
            }
        }
        while(j >= 0 && i >= 0 ){
            if(nums1[i] < nums2[j]){
                nums1[k--] = nums2[j--];
            }
            else
                nums1[k--] = nums1[i--];
        }

        while(j >= 0){
            nums1[j] = nums2[j--];
        }
    }
}