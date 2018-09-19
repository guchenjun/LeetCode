class Solution {
    public int firstMissingPositive(int[] nums) {
    	HashMap<Integer, Integer> hm = new HashMap<>();
    	int n = nums.length;
        for (int i = 0; i < n; i++) {
        	hm.put(i, nums[i]);
        }
        int index = 1;
        while (true) {
        	if (!hm.containsValue(index)) {
        		return index;
        	}
        	index++;
        }
    }
}