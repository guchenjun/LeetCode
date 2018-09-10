
class Solution {
	public boolean isValid(String s) {
		int n = s.length();
		if (s == null | n == 0)
			return true;
		Stack<Character> stack = new Stack<>();
		for (Character ch : s.toCharArray()) {
			if (ch == '[') {
				stack.push(']');
			} else if (ch == '{') {
				stack.push('}');
			} else if (ch == '(') {
				stack.push(')');
			} else if (stack.isEmpty() || stack.pop() != ch) {
				return false;
			}
		}
		return stack.isEmpty();
	}
}