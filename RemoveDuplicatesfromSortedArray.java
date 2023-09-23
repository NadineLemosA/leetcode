package leetCode;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 1, 2, 3, 5, 5 }));
	}

	public static int removeDuplicates(int[] nums) {
		int k;
		ArrayList<Integer> listaDeUnicos = new ArrayList<>();

		listaDeUnicos.add(nums[0]);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("i: " + listaDeUnicos.get(i));

			for (int j = i + 1; j < nums.length; j++) {
				System.out.println("j: " + nums[j]);

				if (listaDeUnicos.get(i) != nums[j]) { // acho que tem coisa errada aqui
					listaDeUnicos.add(nums[j]);
				}
			}
			System.out.println(listaDeUnicos);
			System.out.println();
		}
		System.out.println(listaDeUnicos);

		k = listaDeUnicos.size();

		return k;
	}
}