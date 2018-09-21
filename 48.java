class Solution {
    public void rotate(int[][] matrix) {
    	int n = matrix[0].length;
    	// 先沿主对角线对换一次
        for (int i = 0; i < n; i++) {
        	for (int j = i + 1; j < n; j++) {
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = tmp;
        	}
        }
        // 再左右对调一次
        for(int i = 0; i < n ; i++) {
        	for (int j = 0; j < n / 2; j++) {
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[i][n - 1 - j];
        		matrix[i][n - 1 - j] = tmp;
        	}
        }
    }
}