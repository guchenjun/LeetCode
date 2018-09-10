
class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		generateOneByOne("", list, n, n);
		return list;
	}

	public void generateOneByOne(String subString, List<String> list, int left, int right) {
		if (left > right)
			return;
		if (left > 0) {
			generateOneByOne(subString + "(", list, left - 1, right);
		}
		if (right > 0) {
			generateOneByOne(subString + ")", list, left, right - 1);
		}
		if (left == 0 && right == 0) {
			list.add(subString);
			return;
		}
	}
}