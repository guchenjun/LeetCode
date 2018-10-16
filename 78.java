import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backTrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    public void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int n) {
    	if (tempList.size() <= n) {
    		res.add(new ArrayList<Integer>(tempList));
    	}
    	for (int i = n; i < nums.length; i++) {
    		tempList.add(nums[i]);
    		backTrack(res, tempList, nums, i + 1);
    		tempList.remove(tempList.size() - 1);
    	}
    }
}