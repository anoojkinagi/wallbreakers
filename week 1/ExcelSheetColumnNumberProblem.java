class Solution {
    public int titleToNumber(String s) {
        
           int res =0;
    for(int i =0; i<s.length();i++)
        {
            
            res = (s.charAt(i) - 65 + 1) + res* 26;
        }
    return res;
        
    }
}