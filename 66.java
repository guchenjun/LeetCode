
class Solution {
	public int[] plusOne(int[] digits) {
		int n = digits.length;
		int[] res;
		int carry = 1;
		int len = 0;
		boolean isEnlarge = true;
		for (int i = 0; i < n; i++) {
			if (digits[i] != 9) {
				isEnlarge = false;
				break;
			}
		}
		if (isEnlarge == true) {
			len = n + 1;
			res = new int[len];
		} else {
			len = n;
			res = new int[len];
		}
		for (int i = n - 1, j = len - 1; i >= 0; i--, j--) {
			if (carry + digits[i] > 9) {
				res[j] = 0;
				carry = 1;
			} else {
				res[j] = digits[i] + carry;
				carry = 0;
			}
		}
		if (len == n + 1) {
			res[0] = 1;
		}
		return res;
	}
	
	// LeetCode 优秀解法
	public int[] plusOne2(int[] digits) {
	       
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}