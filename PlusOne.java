package leetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(
                new int[] { 9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 7, 5, 8, 0, 7, 0, 1, 2, 5, 4, 5, 2, 4 })));
    }

    public static int[] plusOne(int[] digits) {
        String transformedToString = "";

        for (int i : digits) {
            transformedToString += i;
        }

        BigInteger bigNumber = new BigInteger(transformedToString);
        bigNumber = bigNumber.add(BigInteger.valueOf(1));

        String backToString = new String(String.valueOf(bigNumber));

        char[] caracteres = (backToString).toCharArray();

        int[] result = new int[caracteres.length];
        int i = 0;

        for (char unit : caracteres) {
            result[i] = Character.getNumericValue(unit);
            i++;
        }

        return result;
    }
}
