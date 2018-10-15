public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backTrack(res, new ArrayList<>(), nums);
        return res;
    }
    
    public void backTrack(List<List<Integer>> res, List<Integer> tempList, int[] nums) {
    	if (tempList.size() == nums.length) {
    		// ArrayList拷贝构造函数创建新实例，加入到res结果集中
    		res.add(new ArrayList<Integer>(tempList));
    		return;
    	}
    	for (int i = 0; i < nums.length; i++) {
    		if (tempList.contains(nums[i])) {
    			continue;
    		}
    		// 加入一个tempList中不存在的元素
    		tempList.add(nums[i]);
    		backTrack(res, tempList, nums);
    		// 删除当前加入的这个元素，继续循环
    		tempList.remove(tempList.size() - 1);
    	}
    }
}