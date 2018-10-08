class Solution {
	// 1 1 2 3 5 8 ... 类似斐波那契数列，递归n>=44超出时间限制；故用动态规划来做
    public int climbStairs(int n) {
    	if (n < 2) {
    		return 1;
    	}
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < n + 1; i++) {
        	// 状态转移方程
        	nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}