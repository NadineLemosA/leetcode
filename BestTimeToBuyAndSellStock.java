package leetCode;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
	}

	public static int maxProfit(int[] prices) {
		int greaterProfit = 0;
		int nextHighestValue = 0;
		int[] highestValueData;
		int indexOfTheNextHighestValue = 0;

		for (int i = 0; i < prices.length; i++) {
			if (i == indexOfTheNextHighestValue) {
				highestValueData = getDataFromTheHighestValueFound(prices, i);
				indexOfTheNextHighestValue = highestValueData[0];
				nextHighestValue = highestValueData[1];
			}

			int profitResult = nextHighestValue - prices[i];

			if (profitResult > greaterProfit) {
				greaterProfit = profitResult;
			}
		}

		return greaterProfit;
	}

	static int[] getDataFromTheHighestValueFound(int[] prices, int indexCurrentHighestValue) {
		int[] highestValueData = new int[2];

		for (int i = indexCurrentHighestValue + 1; i < prices.length; i++) {
			if (prices[i] > highestValueData[1]) {
				highestValueData[0] = i;
				highestValueData[1] = prices[i];
			}
		}

		return highestValueData;
	}
}