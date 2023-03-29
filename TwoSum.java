package leetCode;

public class TwoSum {
	public static void main(String[] args) {
		int[] armazenaResposta = TwoSum.twoSum(new int[] { 3, 2, 3 }, 6);
		for (int i : armazenaResposta) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] respostas = new int[2];

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					respostas[0] = i;
					respostas[1] = j;
				}
			}
		}
		return respostas;
	}
}