class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
    
//         loop through the 2D array 
// reverse the each array inside the big array and perform XOR while reversing
        
        
        for(int i = 0; i<A.length; i++)
        {
                      

            int len = A[i].length;
            if(len % 2 == 0)
            {
             for(int j=0; j <A[i].length/2 ; j++)
             {
                 
                 
          
                 
                  int temp = A[i][j] ^ 1;
                   A[i][j] = A[i][len-1-j] ^ 1;
                  A[i][len-1-j] = temp;
                 
             }
            }
            else
            {
                 for(int j=0; j <=A[i].length/2 ; j++)
             {
                 
                 
          
                 
                  int temp = A[i][j] ^ 1;
                   A[i][j] = A[i][len-1-j] ^ 1;
                  A[i][len-1-j] = temp;
                 
             }
            }
            
        }
        
        return A;
        
    }
}