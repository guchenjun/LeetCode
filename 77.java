public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        //回溯法
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        backtrack(result, tmp, n, k, 1);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> tmp, int n, int k, int start){
        if (tmp.size() == k){
            result.add(new ArrayList(tmp));
            return;
        }
        for (int i = start; i <= n; i++){
            tmp.add(i);
            backtrack(result, tmp, n, k, i+1);
            tmp.remove(tmp.size() - 1);
        }
    }
}