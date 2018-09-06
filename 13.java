class Solution {
	public int romanToInt(String s) {
		if (s.length() == 0) {
			return 0;
		}
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int result = 0, current_value = 0, last_value = 0;
		char[] charArr = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			current_value = hm.get(charArr[i]);
			if (current_value < last_value) {
				result -= current_value;
				last_value = current_value;
			} else {
				result += current_value;
				last_value = current_value;
			}
		}
		return result;
	}
}