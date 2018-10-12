public class QuickSort {
	public static void main(String[] args) {
		int[] nums = {8,4,3,6,9,7,2,1,5};
		quickSort(nums, 0, nums.length - 1);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

	public static void quickSort(int[] a, int left, int right) {
		if (left > right) {
			return;
		}
		int pivot = a[left];
		int i = left, j = right;
		while (i < j) {
			while (a[j] >= pivot && i < j) {
				j--;
			}
			while (a[i] <= pivot && i < j) {
				i++;
			}
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[left] = a[i];
		a[i] = pivot;
		quickSort(a, left, j - 1);
		quickSort(a, j + 1, right);
	}
	// 2018年10月12日 23:14:51
}
