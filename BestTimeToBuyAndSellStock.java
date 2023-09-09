package leetCode;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 2, 1, 2, 1, 0, 1, 2 })); // 2
	}

	public static int maxProfit(int[] prices) {
		int higherProfit = 0;
		int maiorValor = 0;
		int indiceMaiorValor = 0;
		int menorPreco;
		int price;

		for (int i = 1; i < prices.length; i++) {
			int precoVenda = prices[i];
			if (precoVenda > maiorValor) {
				maiorValor = precoVenda;
				indiceMaiorValor = i;
			}
		}

		for (int j = 0; j < indiceMaiorValor; j++) {
			int precoAtual = prices[j];
			if (precoAtual < prices[j + 1]) {
				menorPreco = precoAtual;
				System.out.println(menorPreco);
				price = maiorValor - precoAtual;
				if (price > higherProfit) {
					higherProfit = price;
				}
			}
		}

		return higherProfit;
	}
}
