package leetCode.MergeTwoSortedLists;

import java.util.Arrays;

public class ExercicioComArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[] { 1, 2, 4 }, new int[] { 1, 3, 4, 5 })));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        int j = array1.length;
        for (int i = 0; i < array2.length; i++) {
            mergedArray[j] = array2[i];
            j++;
        }

        for (int i = 0; i < mergedArray.length; i++) {

            for (int k = i + 1; k < mergedArray.length - 1; k++) {
                if (mergedArray[i] > mergedArray[k]) {
                    int temporary = mergedArray[i];
                    mergedArray[i] = mergedArray[k];
                    mergedArray[k] = temporary;
                }
            }
        }

        return mergedArray;
    }
}