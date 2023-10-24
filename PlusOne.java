package leetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] { 9, 9, 9, 9 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 7, 2, 3, 5 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 9, 7, 9, 9 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 9 })));
    }

    public static int[] plusOne(int[] digits) {
        boolean lastNumber = false;

        if (digits.length == 1) {
            if (digits[0] == 9) {
                int[] digitsResult = new int[digits.length + 1];
                digitsResult[0] = 1;
                digitsResult[1] = 0;
                digits = digitsResult;
            } else {
                digits[0] = digits[0] + 1;
            }

        } else {
            for (int i = digits.length - 1; i >= 0; i--) {

                if (lastNumber == false && digits[i] == 9) {

                    if (digits[i] == 9 && digits[i - 1] != 9) {
                        digits[i] = 0;
                        digits[i - 1] = digits[i - 1] + 1;
                    }

                    if (digits[i] == 9 && digits[i - 1] == 9) {
                        for (i = digits.length - 1; i >= 0; i--) {
                            if (digits[i] == 9) {
                                digits[i] = 0;
                            } else {
                                digits[i] = digits[i] + 1;
                                i = 0;
                            }
                        }

                        if (digits[0] == 0) {
                            int[] digitsResult = new int[digits.length + 1];
                            digitsResult[0] = 1;
                            System.arraycopy(digits, 0, digitsResult, 1, digits.length);
                            digits = digitsResult;
                        }
                    }

                    lastNumber = true;
                }

                if (lastNumber == false && digits[i] != 9) {
                    digits[i] += 1;
                    lastNumber = true;
                }
            }
        }

        return digits;
    }
}