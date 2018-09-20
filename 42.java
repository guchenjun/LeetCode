class Solution {
	// 从两端向中间靠拢，取低的一端，向内扫描水，若内部低则加，内部高则该出成为一段，直到左右重叠
	public int trapRainWater(int[] heights) {
		int left = 0, right = heights.length - 1;
		int result = 0;
		if (left >= right - 1) {
			return 0;
		}
		int leftHeight = heights[left];
		int rightHeight = heights[right];
		while (left < right) {
			if (leftHeight < rightHeight) {
				left++;
				if (leftHeight < heights[left]) {
					leftHeight = heights[left];
				} else {
					result += leftHeight - heights[left];
				}
			} else {
				right--;
				if (rightHeight < heights[right]) {
					rightHeight = heights[right];
				} else {
					result += rightHeight - heights[right];
				}
			}
		}
		return result;
	}
}