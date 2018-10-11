class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	int m = matrix.length;
    	if (m == 0) {
    		return false;
    	}
    	int n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
        	int mid = (left + right) / 2;
        	int i = mid / n;
        	int j = mid % n;
        	if (matrix[i][j] > target) {
        		right = mid - 1;
        	} else if (matrix[i][j] < target) {
        		left = mid + 1;
        	} else {
        		return true;
        	}
        }
        return false;
    }
}