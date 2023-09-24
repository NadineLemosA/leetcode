package leetCode;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 1, 1, 1, 1, 10 }));
	}

	public static int removeDuplicates(int[] nums) {
		int k;
		ArrayList<Integer> listaDeUnicos = new ArrayList<>();

		listaDeUnicos.add(nums[0]);

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				listaDeUnicos.add(nums[i + 1]);
			}
		}

		nums = listaDeUnicos.stream().mapToInt(Integer::intValue)
				.toArray();
		;

		System.out.println(listaDeUnicos);

		k = listaDeUnicos.size();

		return k;
	}
}