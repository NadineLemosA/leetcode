package leetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {7,2,8,5})));
    }

    public static int[] plusOne(int[] digits) {
        String transformadoEmString = "";

        for (int i : digits) {
            transformadoEmString += i;
        }

        long numeroGrande = Long.parseLong(transformadoEmString);
        numeroGrande = numeroGrande + 1;
        
        char[] caracteres = Long.toString(numeroGrande).toCharArray(); 

        int[] retorno = new int[caracteres.length];
        int i = 0;

        for (char unidade : caracteres) {
            retorno[i] = Character.getNumericValue(unidade);
            i++;
        }

        return retorno;
    }
}
// int[] array = {1, 2, 3, 4, 5};
// array.toString(); pq isso nao funciona?
// erro de tempo de execução para numeros gigantes