class Solution {
	public boolean canJump(int[] nums) {
		int n = nums.length;
		// dp表示当前能跳到的最大距离
		int[] dp = new int[n];
		dp[0] = nums[0];
		for (int i = 1; i < n; i++) {
			if (dp[i - 1] < i) {
				// 上一次最大距离跳不到当前位置i，就一直保留上一次最大距离
				dp[i] = dp[i - 1];
			} else {
				dp[i] = Math.max(i + nums[i], dp[i - 1]);
			}
		}
		return dp[n - 1] >= (n - 1);
	}

}