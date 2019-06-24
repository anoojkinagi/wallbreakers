class SortArrayByParity{
    public int[] sortArrayByParity(int[] A) {
        
        // loop through the array
        // check if the element is divisible by 2 (even) 
        // if yes, then add it to the result array start,
        // if no (odd) then add from the end of the res array
        
        int res[] = new int[A.length];
        int evenIndex= 0;
        int oddIndex = A.length-1;
        
        
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2 == 0)
            {
                res[evenIndex] = A[i];
                evenIndex++;
            }
            else
            {
                res[oddIndex] = A[i];
                oddIndex--;
            }
        }
        
        return res;
        
    }
}