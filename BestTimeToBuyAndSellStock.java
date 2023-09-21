package leetCode;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
	}

	public static int maxProfit(int[] prices) {
		int maiorLucro = 0;
		int proximoMaiorValor = 0;
		int[] dadosMaiorValor;
		int indiceProximoMaiorValor = 0;

		for (int i = 0; i < prices.length; i++) {
			if (i == indiceProximoMaiorValor) {
				dadosMaiorValor = obtemDadosMaiorValor(prices, i);
				indiceProximoMaiorValor = dadosMaiorValor[0];
				proximoMaiorValor = dadosMaiorValor[1];
			}

			int resultadoCalculo = proximoMaiorValor - prices[i];

			if (resultadoCalculo > maiorLucro) {
				maiorLucro = resultadoCalculo;
			}
		}

		return maiorLucro;
	}

	static int[] obtemDadosMaiorValor(int[] prices, int indiceAtualMaiorValor) {
		int[] dadosMaiorValor = new int[2];

		for (int i = indiceAtualMaiorValor + 1; i < prices.length; i++) {
			if (prices[i] > dadosMaiorValor[1]) {
				dadosMaiorValor[0] = i;
				dadosMaiorValor[1] = prices[i];
			}
		}

		return dadosMaiorValor;
	}
}