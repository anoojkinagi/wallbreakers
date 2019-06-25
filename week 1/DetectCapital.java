class Solution {
    public boolean detectCapitalUse(String word) {
        
        // count the total number of capital letters
        // if count == length, return true  ("USA")
        // if count == 0, return true  ("hello")
        // if first char is capital and count == 1,  return true("Google") 

        
        int capitals = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90)
            {
                capitals++;
            }
        }
        
        if(capitals == word.length() || capitals == 0 || (word.charAt(0) >=65 && word.charAt(0) <= 90 && capitals == 1) )
        {
            return true;
        }
        
        return false;
        
    }
}