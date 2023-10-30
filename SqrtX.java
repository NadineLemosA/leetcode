package leetCode;

public class SqrtX {
    public static void main(String[] args) {
        // System.out.println(mySqrt(8));
        // System.out.println(mySqrt(4));
        // System.out.println(mySqrt(1));
        System.out.println(mySqrt(4000)); // limite de funcionamento
        // System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        double resultadoMultiplicacao;
        int raizEncontradaArredondada = 0;
        double convertido = (double) x;

        for (double i = 0; i < convertido; i += 0.01) {
            resultadoMultiplicacao = (i * i);

            if (convertido == 1) {
                raizEncontradaArredondada = (int) 1;
                i = x;
            } else {
                if (Math.floor(resultadoMultiplicacao) == convertido) {
                    raizEncontradaArredondada = (int) i;
                    i = x;
                }
            }
        }

        return Math.round(raizEncontradaArredondada);
    }
}