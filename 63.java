class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] path = new int[m][n];
		path[0][0] = 1;
		for (int i = 0; i <= m - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				if (obstacleGrid[i][j] == 1) {
					path[i][j] = 0;
				} else {
					if (i == 0 && j == 0) {
						path[i][j] = 1;
					} else if (i == 0) {
						path[i][j] = path[i][j - 1];
					} else if (j == 0) {
						path[i][j] = path[i - 1][j];
					} else {
						path[i][j] = path[i - 1][j] + path[i][j - 1];
					}
				}
			}
		}
		return path[m - 1][n - 1];
	}
}