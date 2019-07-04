<<<<<<< HEAD
class Solution{
    public int[] plusOne(int[] digits) {
        
        // Loop through the digits array
        // if the digit is 9 make it 0
        // if not 9 increase by 1 and return 
        // if the loop ends that means 1 needs to be appended at the beginning
        // So, after for loop create new array with size + 1 and declare 0th element as 1
        // copy all the elements from digits to new array
      
        for(int i = digits.length-1; i>=0;i--)
        {
            if(digits[i] == 9)
            {
                digits[i] = 0;
               
            }
            else
            {
                digits[i] = digits[i]+1;
                return digits;
            }
        }
        
        int[] resArray = new int[digits.length+1];
        resArray[0] = 1;
        for(int i = 1;i<resArray.length;i++)
        {
            resArray[i] = digits[i-1];
        }
        return resArray;
        
        
        
    }
}
=======
class Solution {
    public int[] plusOne(int[] digits) {
        
        // Loop through the digits array
        // if the digit is 9 make it 0
        // if not 9 increase by 1 and return 
        // if the loop ends that means 1 needs to be appended at the beginning
        // So, after for loop create new array with size + 1 and declare 0th element as 1
        // copy all the elements from digits to new array
      
        for(int i = digits.length-1; i>=0;i--)
        {
            if(digits[i] == 9)
            {
                digits[i] = 0;
               
            }
            else
            {
                digits[i] = digits[i]+1;
                return digits;
            }
        }
        
        int[] resArray = new int[digits.length+1];
        resArray[0] = 1;
        for(int i = 1;i<resArray.length;i++)
        {
            resArray[i] = digits[i-1];
        }
        return resArray;
        
        
        
    }
}
>>>>>>> 31294e01ad86a62b852cf6476e94a22c1cb40ec2
