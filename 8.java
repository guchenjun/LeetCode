
public class Solution {

	public int myAtoi(String str) {
		str = str.trim();
		int n = str.length();
		if (n < 1)
			return 0;
		StringBuffer result = new StringBuffer();
		Character ch = str.charAt(0);
		boolean negative = false;
		boolean firstNotZero = false;
		if (((int) ch >= 48 && (int) ch <= 57) || ch == '-' || ch == '+') {
			if (ch == '-') {
				negative = true;
			} else if (ch == '+') {
				negative = false;
			} else {
				if (ch != '0') {
					result.append(ch);
					firstNotZero = true;
				}
			}
		} else {
			return 0;
		}
		for (int i = 1; i < n; i++) {
			ch = str.charAt(i);
			if ((int) ch >= 48 && (int) ch <= 57) {
				if ((firstNotZero == false && ch != '0') || firstNotZero == true) {
					result.append(ch);
					firstNotZero = true;
				}
			} else {
				break;
			}
		}
		int resultLength = result.length();
		if (resultLength < 1)
			return 0;
		if (negative) {
			if (resultLength > 10) {
				return Integer.MIN_VALUE;
			} else if (resultLength == 10) {
				int shortResult = -Integer.parseInt(result.substring(0, resultLength - 1));
				if (shortResult < Integer.MIN_VALUE / 10 || (shortResult == Integer.MIN_VALUE / 10
						&& Integer.parseInt(result.substring(resultLength - 1)) >= 8)) {
					return Integer.MIN_VALUE;
				}
			}
			return -Integer.parseInt(result.toString());
		} else {
			if (resultLength > 10) {
				return Integer.MAX_VALUE;
			} else if (resultLength == 10) {
				int shortResult = Integer.parseInt(result.substring(0, resultLength - 1));
				if (shortResult > Integer.MAX_VALUE / 10 || (shortResult == Integer.MAX_VALUE / 10
						&& Integer.parseInt(result.substring(resultLength - 1)) >= 7)) {
					return Integer.MAX_VALUE;
				}
			}
			return Integer.parseInt(result.toString());
		}
	}
}