package leetCode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 1, 2 }));
	}

	public static int removeDuplicates(int[] nums) {
		int k;
		int[] listaDeUnicos = new int[nums.length];

		listaDeUnicos[0] = nums[0];

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				listaDeUnicos [i] = nums[i + 1];
			}
		}

		System.out.println(Arrays.toString(listaDeUnicos));

		k = listaDeUnicos.length;

		return k;
	}
}