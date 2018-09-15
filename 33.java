class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
        	int mid = (low + high) / 2;
        	if (nums[mid] == target) {
        		return mid;
        	}
        	if (nums[mid] >= nums[low]) {
        		//旋转点在右侧
        		if (target >= nums[low] && target <= nums[mid]) {
        			high = mid - 1;
        		} else {
        			low = mid + 1;
        		}
        	} else {
        		//旋转点在左侧
        		if (target >= nums[mid] && target <= nums[high]) {
        			low = mid + 1;
        		} else {
        			high = mid - 1;
        		}
        	}
        }
        return -1;
    }
}