
class Solution {
	public List<String> letterCombinations(String digits) {
		// for example, input "23"
		List<String> res = new ArrayList<>();
		if (digits == null | digits.length() == 0)
			return res;
		Map<Character,String> map = new HashMap<>();
		map.put('0', "");
		map.put('1', "");
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		StringBuilder[] strs = new StringBuilder[digits.length()];
		for (int i = 0; i < digits.length(); i++) {
			strs[i] = new StringBuilder();
			strs[i].append(map.get(digits.charAt(i)));
		}
		// strs = {"abc", "def"}
		res.add("");
		for (int i = 0; i <digits.length(); i++) {
			List<String> tempList = new ArrayList<String>();
			for (String value : res) {
				for (int j = 0; j < strs[i].length(); j++) {
					tempList.add(value + strs[i].charAt(j));
				}
				//first time{"a", "b", "c"}
				//last time {"ad", "ae", "af", "bd", "be", "bf", ...3more}
			}
			res = tempList;
		}
		return res;
	}
}