class Solution {
	public boolean isValidSudoku(char[][] board) {
		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 9; x++) {
				char toVerifiedNum = board[y][x];
				boolean isRow = checkRow(board, toVerifiedNum, x, y);
				boolean isColumn = checkColumn(board, toVerifiedNum, x, y);
				boolean isSquare = checkSquare(board, toVerifiedNum, x, y);
				if (isRow && isColumn && isSquare) {
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkRow(char[][] board, char c, int x, int y) {
		int index = 0;
		while (index < 9) {
			if (index != x) {
				if (c == board[y][index] && c != '.') {
					return false;
				}
			}
			index++;
		}
		return true;
	}

	public boolean checkColumn(char[][] board, char c, int x, int y) {
		int index = 0;
		while (index < 9) {
			if (index != y) {
				if (c == board[index][x] && c != '.') {
					return false;
				}
			}
			index++;
		}
		return true;
	}

	public boolean checkSquare(char[][] board, char c, int x, int y) {
		int beginX = x / 3 * 3;
		int beginY = y / 3 * 3;
		for (int i = beginX; i < beginX + 3; i++) {
			for (int j = beginY; j < beginY + 3; j++) {
				if (i == x && j == y) {
					continue;
				} else {
					if (c == board[j][i] && c != '.') {
						return false;
					}
				}
			}
		}
		return true;
	}
}