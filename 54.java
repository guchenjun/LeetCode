import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
        	return res;
        }
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        int arrSize = rowNum * colNum;
        int left = 0, right = colNum - 1, top = 0, bottom = rowNum - 1;
        while(res.size() < arrSize) {
        	for (int col = left; col <= right; col++) {
        		res.add(matrix[top][col]);
        	}
        	top++;
        	if (res.size() < arrSize) {
        		for (int row = top; row <= bottom; row++) {
        			res.add(matrix[row][right]);
        		}
        		right--;
        	}
        	if (res.size() < arrSize) {
        		for (int col = right; col >= left; col--) {
        			res.add(matrix[bottom][col]);
        		}
        		bottom--;
        	}
        	if (res.size() < arrSize) {
        		for (int row = bottom; row >= top; row--) {
        			res.add(matrix[row][left]);
        		}
        		left++;
        	}
        }
        return res;
    }
}
