class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) {
			return new ArrayList<>();
		}
		Map<String, List<String>> ans = new HashMap<>();
		for (String s : strs) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String str = String.valueOf(arr);
			if (!ans.containsKey(str)) {
				ans.put(str, new ArrayList<String>());
			}
			ans.get(str).add(s);
		}
		return new ArrayList<>(ans.values());
	}
}