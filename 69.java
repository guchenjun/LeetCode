class Solution {
    public int mySqrt(int x) {
    	if (x <= 1) {
            return x;
        }
    	long min = 1;
    	long max = x;
    	while (min <= max) {
    		long mid = (min + max) / 2;
    		if (mid * mid > x) {
    			max = mid - 1;
    		} else if (mid * mid < x) {
    			min = mid + 1;
    		} else {
    			return (int)mid;
    		}
    		
    	}
    	return (int)min - 1;
    }
}