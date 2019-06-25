class FizzBuzzProblem{
    public List<String> fizzBuzz(int n) {
        
        // loop through 1 to n
        // Check if it divisible by both 5 and 3 ( add FizzBuzz)
        // if divisible by 3 (add Fizz)
        // if divisible by 5 (add Buzz)
        // else add (the number (convert to string))
        
        ArrayList<String> resArray = new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
            if( i % 3 == 0 && i % 5 == 0)
            {
                resArray.add("FizzBuzz");
            }
            else if( i % 3 == 0)
            {
                resArray.add("Fizz");
                
            }
            else if( i % 5 == 0)
            {
                resArray.add("Buzz");
            }
            else
            {
                resArray.add(Integer.toString(i));
            }
        }
        return resArray;
    }
}