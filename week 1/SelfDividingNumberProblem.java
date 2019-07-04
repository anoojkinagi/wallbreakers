class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
//      Loop from left to right values
// 	    convert each number to string and loop through all the digits
// 	    check if  the number is divisible by each digit
// 	    Even if one digit does not divide the number set flag to false
// 	    after inner loop ends check if flag is true then add it to the list.
            
        List<Integer> resArray = new ArrayList<Integer>();
        for(int i=left; i<=right;i++)
        {
            boolean flag = true;
             String strNumber = Integer.toString(i); 

             for(int j=0;j<strNumber.length();j++)
             {
                 if(Character.getNumericValue(strNumber.charAt(j)) == 0)
                 {
                     flag = false;
                     break;
                 }
                     
                 if( i % Character.getNumericValue(strNumber.charAt(j)) != 0)
                 {
                     flag = false;
                 }
                
                 
             }
            if(flag == true)
            {
                resArray.add(i);
            }
        }
        
        return resArray;
        
    }
}