class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
        	return 0;
        }
        String[] strs = s.split(" ");
        int n = strs.length;
        if (n == 0) {
        	return 0;
        } else {
        	return strs[n - 1].length();
        }
    }
}