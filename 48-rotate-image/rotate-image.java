class Solution {
    public void rotate(int[][] matrix) {
        
        
        int n = matrix.length;
        // brute force

        /*
        int[][] res = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[j][n-1-i] = matrix[i][j];
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = res[i][j];
            }
        }
        */

        // in space
        int temp , l ,r;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i > j)
                    continue;
                temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =  temp;
            }
            l =0 ; 
            r =n-1;
             
            while(l <= r){
                temp = matrix[i][l] ;
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
            
        }


        
        
    }
}