class Solution {
	public int totalNQueens(int n) {
		List<List<String>> res = new ArrayList<List<String>>();
		int[] queenList = new int[n];
		placeQueen(queenList, 0, n, res);
		return res.size();
	}
	
	private void placeQueen(int[] queenList, int row, int n, List<List<String>> res) {
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
		for (int col = 0; col < n; col++) {
			if (isValid(queenList, row, col)) {
				queenList[row] = col;
				placeQueen(queenList, row + 1, n, res);
			}
		}
	}
	
	private boolean isValid(int[] queenList, int row, int col) {
		for (int i = 0; i < row; i++) {
			int pos = queenList[i];
			if (pos == col) {
				return false;
			}
			if (pos + (row - i) == col) {
				return false;
			}
			if (pos - (row - i) == col) {
				return false;
			}
		}
		return true;
	}
}
