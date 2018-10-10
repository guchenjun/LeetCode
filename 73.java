import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
    public void setZeroes(int[][] matrix) {
    	int m = matrix.length;
    	int n = matrix[0].length;
    	List<Integer> row = new ArrayList<>();
    	List<Integer> column = new ArrayList<>();
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (matrix[i][j] == 0) {
        			if (!row.contains(i)) {
        				row.add(i);
        			}
        			if (!column.contains(j)) {
        				column.add(j);
        			}
        		}
        	}
        }
        if (row.size() >= 1) {
        	Iterator<Integer> it = row.iterator();
        	while (it.hasNext()) {
        		int k = it.next();
        		for (int i = 0; i < n; i++) {
        			matrix[k][i] = 0;
        		}
        	}
        }
        if (column.size() >= 1) {
        	Iterator<Integer> it = column.iterator();
        	while (it.hasNext()) {
        		int k = it.next();
        		for (int i = 0; i < m; i++) {
        			matrix[i][k] = 0;
        		}
        	}
        }
    }
}