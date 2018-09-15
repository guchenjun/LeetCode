class Solution {
	public void nextPermutation(int[] nums) {
		if (nums == null || nums.length <= 1)
			return;
		int i = nums.length - 2;
		//找到第一个比它后一位数小 的下标,eg.68754,其中的6
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}
		int j = nums.length - 1;
		//找到比前面的数(6)大的数(7) 的下标,交换,78654
		if (i >= 0) {
			while (nums[i] >= nums[j]) {
				j--;
			}
			swap(nums, i, j);
		}
		int k = nums.length - 1;
		i++;
		//连续交换
		//74658
		//74568
		for (; i < k; i++, k--) {
			swap(nums, i, k);
		}
	}

	public void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}

}