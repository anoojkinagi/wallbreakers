class Solution {
    public int[][] transpose(int[][] A) {
        
        // create a new 2D array with row length equal to A's column length 
        //  and column length equal to A's row length
        //  loop through the A's array and 
        //  resArr[ij[i] = A[i][j]
           
         int[][] resArr = new int[A[0].length][A.length];
        
        for(int i = 0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++ )
            {
                
                
                    resArr[j][i] = A[i][j];
                
            }
        }
        
        return resArr;
    }
}