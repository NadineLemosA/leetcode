package leetCode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 1, 2, 3, 5, 5 })); // 1,1,1,2,2,2
	}

	public static int removeDuplicates(int[] nums) {
		int k;
		int[] listaDeUnicos = new int[nums.length]; //  a lista deve ser arraylist e achar modo de comparar int com interger

		listaDeUnicos[0] = nums[0];

		for (int i = 0; i < nums.length - 1; i++) {
			// System.out.println("i: " + listaDeUnicos.get(i));
			if (listaDeUnicos[i] != nums[i + 1]) {
				listaDeUnicos[i + 1] = nums[i + 1];
			}

			// for (int j = i + 1; j < nums.length; j++) {
			// System.out.println("j: " + nums[j]);

			// if (listaDeUnicos.get(i) != nums[j]) {
			// listaDeUnicos.add(nums[j]);
			// }
			// }

			System.out.println(Arrays.toString(listaDeUnicos));
			System.out.println();
		}

		System.out.println(listaDeUnicos);

		k = listaDeUnicos.length;

		return k;
	}
}