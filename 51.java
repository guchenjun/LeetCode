import java.util.List;
import java.util.ArrayList;

public class Solution {
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> res = new ArrayList<List<String>>();
		int[] queenList = new int[n]; // 第i个位置存放的数表示row行时，Q的列
		placeQueen(queenList, 0, n, res);// 在第0行放Q
		return res;
	}

	private void placeQueen(int[] queenList, int row, int n, List<List<String>> res) {
		// 如果已经填满，就生成结果
		if (row == n) {
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				StringBuilder sb = new StringBuilder();
				for (int col = 0; col < n; col++) {
					if (queenList[i] == col) {
						sb.append("Q");
					} else {
						sb.append(".");
					}
				}
				list.add(sb.toString());
			}
			res.add(list);
		}
		for (int col = 0; col < n; col++) {// 循环每一列
			if (isValid(queenList, row, col)) { // 如果在该列放入Q不冲突的话
				queenList[row] = col;
				placeQueen(queenList, row + 1, n, res);
			}
		}
	}

	private boolean isValid(int[] queenList, int row, int col) {
		for (int i = 0; i < row; i++) {
			int pos = queenList[i];
			if (pos == col) { // 和新加入的Q处于同一列
				return false;
			}
			if (pos + row - i == col) { // 在新加入的Q的右对角线上
				return false;
			}
			if (pos - row + i == col) { // 在新加入的Q的左对角线上
				return false;
			}
		}
		return true;
	}
}
