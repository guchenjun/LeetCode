class Solution {
	public boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				// 以board[i][j]为起始点，作深度遍历DFS
				if (exist(board, word, i, j, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean exist(char[][] board, String word, int i, int j, int start) {
		// 验证成功所有word字符存在并可行
		if (start >= word.length()) {
			return true;
		}
		// 上下左右超出边界
		if (i < 0 || i >= board.length || j >= board[0].length || j < 0) {
			return false;
		}
		// 找到则继续深度遍历下去找下一个字符
		if (board[i][j] == word.charAt(start++)) {
			char c = board[i][j];
			board[i][j] = '#';
			boolean isExist = exist(board, word, i + 1, j, start) || exist(board, word, i - 1, j, start)
					|| exist(board, word, i, j + 1, start) || exist(board, word, i, j - 1, start);
			board[i][j] = c;
			return isExist;
		}
		return false;
	}
}