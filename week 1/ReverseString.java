<<<<<<< HEAD
class Solution {
    public void reverseString(char[] s) {
        
        
        // Loop through the char array s till len/2
        // swap the left char (ith index) with right char (len-1 -i index) 
        
        int len = s.length;
        for(int i=0; i<len/2;i++)
        {
            char temp = s[i];
            s[i] = s[len-1 - i];
            s[len-1 - i] = temp;
        }
        
        
        
    }
=======
class Solution {
    public void reverseString(char[] s) {
        
        
        // Loop through the char array s till len/2
        // swap the left char (ith index) with right char (len-1 -i index) 
        
        int len = s.length;
        for(int i=0; i<len/2;i++)
        {
            char temp = s[i];
            s[i] = s[len-1 - i];
            s[len-1 - i] = temp;
        }
        
        
        
    }
>>>>>>> 31294e01ad86a62b852cf6476e94a22c1cb40ec2
}