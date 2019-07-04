class Solution {
    public boolean isHappy(int n) {
        
        
//         Used HashSet to limit the loop
// divide the number and keep adding the remainders 
// if the sum is 1 return true
// else n = new Sum
        
     Set<Integer> inLoop = new HashSet<Integer>();
    int squareSum,remain;
	while (inLoop.add(n)) {
		squareSum = 0;
		while (n > 0) {
		    remain = n%10;
			squareSum += remain*remain;
			n /= 10;
		}
		if (squareSum == 1)
			return true;
		else
			n = squareSum;

	}
	return false;

}
}