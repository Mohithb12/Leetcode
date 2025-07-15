class Solution {
    public void setZeroes(int[][] matrix) {

        int col = matrix[0].length;
        int row = matrix.length;

        // Brute force
        /*
        for(int m=0;m<row;m++)
        {
            for(int n=0;n<col;n++)
            {
                if(matrix[m][n]==0)
                {
                    for(int i=0;i<col;i++)
                    {
                        if(matrix[m][i]>0 || matrix[m][i]<0)
                        {
                            matrix[m][i] = Integer.MIN_VALUE;
                        }
                    }
                    for(int i=0;i<row;i++)
                    {
                        if(matrix[i][n] > 0 || matrix[i][n]<0 )
                        {
                            matrix[i][n]=Integer.MIN_VALUE;
                        }
                    }
                }
            }
        }

        for(int m=0;m<row;m++)
        {
            for(int n=0;n<col;n++)
            {
                if(matrix[m][n]==Integer.MIN_VALUE)
                {
                    matrix[m][n] = 0;
                }
            }
        }

        */

        // Better using 2 arrays

/*
        int[] zero_row = new int[row] ;

        int[] zero_col = new int[col];

        for(int m =0;m<row;m++)
        {
            for(int n=0;n<col;n++)
            {
                if(matrix[m][n] ==0)
                {
                    zero_row[m] = 1;
                    zero_col[n] = 1;
                }
            }
        }

        for(int m=0;m<row;m++)
        {
            for(int n=0;n<col;n++)
            {
                if(zero_row[m] == 1 || zero_col[n]==1 && matrix[m][n]!=0 )
                {
                    matrix[m][n] = 0;
                }
            }
        }
        */

        // optimal

        int col0 =1;
        for(int m =0;m<row;m++)
        {
            for(int n=0;n<col;n++)
            {
                if(matrix[m][n] == 0)
                {
                    matrix[m][0] = 0;
                    
                    if(n != 0)
                        matrix[0][n] = 0;
                    else
                        col0 = 0;
                }
            }
        }

        for(int m=1 ; m<row ; m++)
        {
            for(int n=1; n<col;n++)
            {
                if(matrix[0][n] == 0 || matrix[m][0]==0)
                    matrix[m][n] = 0;
            }
        }

        if(matrix[0][0] == 0)
        {
            for(int i = 0;i<col;i++)
            {
                matrix[0][i] = 0;
            }
        }

        if(col0 == 0)
        {
            for(int i=0;i<row;i++)
            {
                matrix[i][0] = 0;
            }
        }


    }
}