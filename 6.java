
public class Solution {
	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		int len = s.length();
		int cycleLen = 2 * numRows - 2;
		StringBuffer ret = new StringBuffer();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; i + j < len; j += cycleLen) {
				ret.append(s.charAt(i + j));
				if (i != 0 && i != numRows -1 && j + cycleLen - i < len) {
					ret.append(s.charAt(j + cycleLen - i));
				}
			}
		}
		return ret.toString();
	}
	
}