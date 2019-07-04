class PowerOfTwoProblem{
    public boolean isPowerOfTwo(int n) {
        
        // keep checking if the number is divisible by 2 ( n %2 == 0)
        // if in the end the n = 1 return true else false
        
        if(n==0)
            return false;
        while( n % 2 == 0)
        {
            n= n/2;
        }
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}