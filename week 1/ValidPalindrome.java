class Solution {
    public boolean isPalindrome(String s) {
        
        // create two stringbuffers to hold only alphanumeric chars
        // 1 to hold the input string
        // 2 to hold the reverse
        // compare both, if equal return true else false
        
        
        if(s.length() == 0)
        {
            return true;
        
        
        StringBuffer sb =new StringBuffer();
           StringBuffer sbrev =new StringBuffer();
        for(int i = 0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i)))
               {
                   sb.append(s.charAt(i));
                   
               }
        }
        for(int i = s.length()-1;i>=0;i--)
        {
            if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i)))
               {
                   sbrev.append(s.charAt(i));
                   
               }
        }
        String str1 = sb.toString().toLowerCase();
        String str2 = sbrev.toString().toLowerCase();
       
       if(str1.equals(str2))
       {
           return true;
       }
    
        return false;
    }
}