class Solution {
	public int searchInsert(int[] nums, int target) {
		int n = nums.length;
		if (n == 1 && target <= nums[0]) {
			return 0;
		}
		for (int i = 0; i < n - 1; i++) {
			if (target == nums[i]) {
				return i;
			} else if (target <= nums[i]) {
				insertElement(nums, i, target);
				return i;
			} else if (target >= nums[i] && target <= nums[i + 1]) {
				return i + 1;
			}
		}
		return n;
	}

	public void insertElement(int[] nums, int index, int target) {
		int n = nums.length;
		int SIZE = n - index;
		int[] tmpArray = new int[SIZE];
		for (int i = index, j = 0; i < n; i++, j++) {
			tmpArray[j] = nums[i];
		}
		nums[index] = target;
		for (int i = index + 1, j = 0; i < n; i++, j++) {
			nums[i] = tmpArray[j];
		}
	}

}