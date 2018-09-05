class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max_volume = 0;
        for (int i = 0; i < n - 1; i++) {
        	for (int j = i + 1; j < n; j++) {
        		int min_height = Math.min(height[i], height[j]);
        		max_volume = Math.max(max_volume, min_height * (j - i));
        	}
        }
        return max_volume;
    }
}