package leetCode;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 })); // 4
	}

	public static int maxProfit(int[] prices) {
		int higherProfit = 0;
		int maiorValor = 0;
		int indiceMaiorValor = 0;
		int price;

		for (int i = 1; i < prices.length; i++) {
			int precoVenda = prices[i];
			if (precoVenda >= maiorValor) {
				maiorValor = precoVenda;
				indiceMaiorValor = i;
			}
		}
		System.out.println(indiceMaiorValor);

		for (int j = 0; j < indiceMaiorValor; j++) {
			int precoAtual = prices[j];
			if (precoAtual < prices[j + 1]) {
				price = maiorValor - precoAtual;
				if (price > higherProfit) {
					higherProfit = price;
				}
			}
		}

		return higherProfit;
	}
}
