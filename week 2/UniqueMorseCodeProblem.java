class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        
//         create a String array of morse codes
// create a set to keep track of all the string codes
// loop through words array and loop through each char in a word
// find the code from codes array and append to StringBuilder
// add the morse code to set
// since duplicates not allowed return set size
        
        String[] codes = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        
        HashSet<String> newSet = new HashSet();
        
        for(String word: words)
        {
            StringBuilder sb = new StringBuilder();
            
            char[] charArr = word.toCharArray();
            
            for(char c: charArr)
            {
                sb.append(codes[c - 'a']);
            }
            newSet.add(sb.toString());
            
        }
        
        return newSet.size();
        
        
    }
}