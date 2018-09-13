class Solution {
    public int[] searchRange(int[] nums, int target) {
    	int n = nums.length;
        if (n == 0 || target < nums[0] || target > nums[n - 1])
        	return new int[] {-1, -1};
        int start = -1, end = -1;
        for (int i = 0; i < n; i++) {
        	if (nums[i] == target) {
        		if (start == -1) {
        			start = i;
        		}
        		end = i;
        	}
        }
        return new int[] {start, end};
    }
}