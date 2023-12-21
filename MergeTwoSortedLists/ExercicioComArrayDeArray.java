package leetCode.MergeTwoSortedLists;

import java.util.Arrays;

public class ExercicioComArrayDeArray {
    public static void main(String[] args) {
        int[] array1 = { 1 };
        int[] array2 = { 2 };
        int[] array3 = { 4 };
        int[] array4 = new int[] { 1 };
        int[] array5 = new int[] { 3 };
        int[] array6 = new int[] { 4 };

        System.out.println(Arrays
                .toString(mergeArrays(new int[][] { array1, array2, array3 }, new int[][] { array4, array5, array6 })));
    }

    public static int[] mergeArrays(int[][] array1, int[][] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0;

        for (int[] array : array1) {
            for (int arrayElement : array) {
                mergedArray[i] = arrayElement;
                i++;
            }
        }

        for (int[] array : array2) {
            mergedArray[i] = array[0];
            i++;
        }

        for (int j = 0; j < mergedArray.length; j++) {
            for (int k = j + 1; k < mergedArray.length - 1; k++) {
                if (mergedArray[j] > mergedArray[k]) {
                    int temporary = mergedArray[k];
                    mergedArray[k] = mergedArray[j];
                    mergedArray[j] = temporary;
                }
            }
        }

        return mergedArray;
    }
}