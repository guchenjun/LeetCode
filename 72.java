class Solution {
	/**
	 * Ø a b c d 
	 Ø 0 1 2 3 4 
	 b 1 1 1 2 3 
	 b 2 2 1 2 3 
	 c 3 3 2 1 2
	 */
	// 参考 https://blog.csdn.net/NichChen/article/details/75929124
	// 参考 https://blog.csdn.net/u012891055/article/details/79188385
	public int minDistance(String word1, String word2) {
		int m = word1.length(), n = word2.length();
		int[][] dp = new int[m + 1][n + 1];
		for (int i = 0; i < m + 1; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j < n + 1; j++) {
			dp[0][j] = j;
		}
		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]);
				}
			}
		}
		return dp[m][n];
	}
}