class Solution {
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		String result = "1";
		for (int i = 1; i < n; i++) {
			result = countNextValue(result);
		}
		return result;
	}

	public String countNextValue(String str) {
		char[] arr = str.toCharArray();
		int begin = 0;
		char prev = arr[0];
		String res = "";
		int n = arr.length;
		if (n == 1) {
			return "1" + prev;
		}
		for (int i = 1; i < n; i++) {
			if (arr[i] != prev) {
				res += String.valueOf(i - begin) + String.valueOf(prev);
				begin = i;
			}
			if (i == n - 1) {
				res += String.valueOf(i - begin + 1) + String.valueOf(arr[i]);
			}
			prev = arr[i];
		}
		return res;
	}

	// Solution2: LeetCode上的优秀解法
	/**
	 * 1.recusive 2.StringBuilder -> append
	 */
	public String countAndSay2(int n) {
		if (n == 1)
			return "1";
		return count(countAndSay(n - 1));
	}

	private String count(String s) {
		StringBuilder sb = new StringBuilder();
		int k = 0;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) != s.charAt(k)) {
				sb.append(j - k);
				sb.append(s.charAt(k));
				k = j;
			}
			if (j == s.length() - 1) {
				sb.append(j - k + 1);
				sb.append(s.charAt(k));
			}
		}
		return sb.toString();
	}
}