class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n =matrix.length;
        long sum = 0;
        int minabs = Integer.MAX_VALUE,negcnt=0;

        for(int i=0;i<n;i++){
            for(int val:matrix[i]){
                
                if(val < 0) negcnt++;
                int absval = Math.abs(val);
                sum += absval;
                minabs = Math.min(minabs,absval);

            }
        }

        if(negcnt %2 != 0){
            sum -=  2L * minabs;
        }

        return sum;
    }
}