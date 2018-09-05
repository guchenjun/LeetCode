class Solution {
	public String intToRoman(int num) {
		StringBuffer sb = new StringBuffer();
		int M = 0, CM = 0, D = 0, CD = 0, C = 0, XC = 0;
		int L = 0, XL = 0, X = 0, IX = 0, V = 0, IV = 0, I = 0;
		M = num / 1000;
		CM = (num - M * 1000) >= 900 ? 1 : 0; 
		D = (num - M * 1000 - CM * 900) / 500;
		CD = (num - M * 1000 - CM * 900 - D * 500) >= 400 ? 1 : 0;
		C = (num - M * 1000 - CM * 900 - D * 500 - CD * 400) / 100;
		XC = (num - M * 1000 - CM * 900 - D * 500 - CD * 400 - C * 100) >= 90 ? 1 : 0;
		L = (num - M * 1000 - CM * 900 - D * 500 - CD * 400 - C * 100 - XC * 90) / 50;
		XL = (num - M * 1000 - CM * 900 - D * 500 - CD * 400 - C * 100 - XC * 90 - L * 50) >= 40 ? 1 : 0;
		X = (num - M * 1000 - CM * 900 - D * 500 - CD * 400 - C * 100 - XC * 90 - L * 50 - XL * 40) / 10;
		IX = (num - M * 1000 - CM * 900 - D * 500 - CD * 400 - C * 100 - XC * 90 - L * 50 - XL * 40 - X * 10) >= 9 ? 1 : 0;
		V = (num - M * 1000 - CM * 900 - D * 500 - CD * 400 - C * 100 - XC * 90 - L * 50 - XL * 40 - X * 10 - IX * 9)
				/ 5;
		IV = (num - M * 1000 - CM * 900 - D * 500 - CD * 400 - C * 100 - XC * 90 - L * 50 - XL * 40 - X * 10 - IX * 9
				- V * 5) >= 4 ? 1 : 0;
		I = num - M * 1000 - CM * 900 - D * 500 - CD * 400 - C * 100 - XC * 90 - L * 50 - XL * 40 - X * 10 - IX * 9
				- V * 5 - IV * 4;
		int[] intArr = new int[] { M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I };
		String[] strArr = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		for (int k = 0; k < intArr.length; k++) {
			while (intArr[k] > 0) {
				sb.append(strArr[k]);
				intArr[k]--;
			}
		}
		return sb.toString();
	}
}