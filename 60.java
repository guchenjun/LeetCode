import java.util.Vector;

class Solution {

	public static int Factorial(int n) {
		while (n > 1) {
			return n * Factorial(n - 1);
		}
		return 1;
	}

	public String permutation(int n, int k) {
		StringBuilder res = new StringBuilder();
		// Vector相比ArrayList是线程安全的
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 1; i <= n; i++) {
			v.add(i);
		}
		int size = n;
		for (int i = 1; i <= size; i++) {
			// 通过ceil(k / (n-1)!)找出每一轮哪个数字打头,加到结果中去
			int index = (int) Math.ceil(1.0 * k / Factorial(n - 1));
			res.append(String.valueOf(v.get(index - 1)));
			// 删掉这个数字, 重新计算k在下一轮中的位置, 同时n--
			v.remove(index - 1);
			k = k - (index - 1) * Factorial(n - 1);
			n--;
		}
		return res.toString();
	}
}

// 参考 https://blog.csdn.net/qq_38310176/article/details/81227086