class Solution {
	
	public int maxSubArray(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = nums[0];
		int max = dp[0];
		// 当前n的最优解等于n-1的最优解加上当前值和当前值比较，取大的
		// dp[i] = max{nums[i], dp[i - 1] + nums[i]}
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
