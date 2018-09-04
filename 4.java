class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		final int SIZE = nums1.length + nums2.length;
		int[] arr = new int[SIZE];
		for (int i = 0, p = 0, q = 0; i < SIZE; i++) {
			if (p < nums1.length && q < nums2.length) {
				arr[i] = (nums1[p] < nums2[q]) ? nums1[p++] : nums2[q++];
			} else if (p < nums1.length) {
				arr[i] = nums1[p++];
			} else if (q < nums2.length) {
				arr[i] = nums2[q++];
			}
		}
		if (SIZE % 2 == 0) {
			return (double) (arr[SIZE / 2 - 1] + arr[SIZE / 2]) / 2;
		} else {
			return (double) arr[SIZE / 2];
		}
	}
}