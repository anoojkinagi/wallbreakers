class Solution {
    public int numJewelsInStones(String J, String S) {
        
        
//         loop through String S 
// check if each char is present in J 
// if yes then increase count
        
        
        int count =0;
        
        for(int  i=0;i<S.length();i++)
        {
            char c = S.charAt(i);
            if(J.indexOf(c)!=-1)
            {
                System.out.println(c);
                count++;
            }
        }
        return count;
        
    }
}