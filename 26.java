class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 1; i < n; i++) {
        	if (nums[i] != nums[j]) {
        		j++;
        		nums[j] = nums[i];
        	} else {
        		continue; // if equals then next loop.
        	}
        }
        return j + 1;
    }
}