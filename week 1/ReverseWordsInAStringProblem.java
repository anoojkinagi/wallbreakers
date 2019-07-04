<<<<<<< HEAD
class Solution {
    public String reverseWords(String s) {
        
//         split the string s to String array with " "
// covert each string to array further and reverse the chars and join to form a String 
// In the end Join the bigger array to form the reversed sentence.
        
        String[] charStr = s.split(" ");
        for(int i=0; i<charStr.length; i++)
        {
            int len = charStr[i].length();
            String str = charStr[i];
            String[] charStr2 = str.split("");
            System.out.println(Arrays.toString(charStr2)+" "+ len);
              for(int j=0; j<len/2; j++)
              {
                  
                   String temp = charStr2[j];
                   charStr2[j] = charStr2[len-1-j];
                  charStr2[len-1-j] = temp;
                  // str.charAt(len-1-j) = temp;
              }
            charStr[i] = String.join("",charStr2);
            
        }
        
        return String.join(" ",charStr);
    }
=======
class Solution {
    public String reverseWords(String s) {
        
//         split the string s to String array with " "
// covert each string to array further and reverse the chars and join to form a String 
// In the end Join the bigger array to form the reversed sentence.
        
        String[] charStr = s.split(" ");
        for(int i=0; i<charStr.length; i++)
        {
            int len = charStr[i].length();
            String str = charStr[i];
            String[] charStr2 = str.split("");
            System.out.println(Arrays.toString(charStr2)+" "+ len);
              for(int j=0; j<len/2; j++)
              {
                  
                   String temp = charStr2[j];
                   charStr2[j] = charStr2[len-1-j];
                  charStr2[len-1-j] = temp;
                  // str.charAt(len-1-j) = temp;
              }
            charStr[i] = String.join("",charStr2);
            
        }
        
        return String.join(" ",charStr);
    }
>>>>>>> 31294e01ad86a62b852cf6476e94a22c1cb40ec2
}