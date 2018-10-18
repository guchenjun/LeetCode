class Solution {
    public int removeDuplicates(int[] nums) {
        // int n = nums.length;
        // if (n < 3) {
        //     return n;
        // }
        // int index = 0;
        // boolean isTwice = false;
        // for (int i = 0; i < n; i++) {
        //     if (i + 1 < n && nums[i] == nums[i + 1]) {
        //         if (!isTwice) {
        //             isTwice = true;
        //             nums[index++] = nums[i];
        //         }
        //     } else {
        //         isTwice = false;
        //         nums[index++] = nums[i];
        //     }
        // }
        // return index;
        
        int n = nums.length;
        if (n < 3) {
            return n;
        }
        int len = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] > nums[len - 2]) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}