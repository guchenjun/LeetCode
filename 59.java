class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int size = n * n;
        int index = 1;
        int left = 0, top = 0, right = n - 1, bottom = n - 1;
        // a[y][x] 第一个是行，第二个是列，分清楚就好螺旋赋值了
        while (index <= size) {
        	for (int i = left; i <= right; i++) {
        		res[top][i] = index++;
        	}
        	top++;
        	for (int i = top; i <= bottom; i++) {
        		res[i][right] = index++;
        	}
        	right--;
        	for (int i = right; i >= left; i--) {
        		res[bottom][i] = index++;
        	}
        	bottom--;
        	for (int i = bottom; i >= top; i--) {
        		res[i][left] = index++;
        	}
        	left++;
        }
        return res;
    }
}