class Solution {
	public String longestCommonPrefix(String[] strs) {
		int n = strs.length;
		if (n < 1 || strs[0].length() == 0) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		int index = 0;
		Character ch = strs[0].charAt(index);
		for (int i = 0; i < n; i++) {
			if (index >= strs[i].length()) {
				return sb.toString();
			}
			if (ch == strs[i].charAt(index)) {
				if (i == n - 1) {
					sb.append(ch);
					if (++index >= strs[0].length()) {
						return sb.toString();
					} else {
						ch = strs[0].charAt(index);
						i = 0;
					}
				} else {
					continue;
				}
			} else {
				break;
			}
		}
		return sb.toString();
	}

	//用startsWith函数判断前缀，用第一个作参照。
	public static String longestCommonPrefix2(String[] strs) {
		int count = strs.length;
		String prefix = "";
		if (count != 0) {
			prefix = strs[0];
		}
		for (int i = 0; i < count; i++) {
			while (!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}
}