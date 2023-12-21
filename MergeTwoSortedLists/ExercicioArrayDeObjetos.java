package leetCode.MergeTwoSortedLists;

import java.util.Arrays;

public class ExercicioArrayDeObjetos {
    public static void main(String[] args) {
        ObjetoParaOArray[] array1 = { new ObjetoParaOArray(1), new ObjetoParaOArray(2), new ObjetoParaOArray(4) };
        ObjetoParaOArray[] array2 = { new ObjetoParaOArray(1), new ObjetoParaOArray(3), new ObjetoParaOArray(4) };
        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
    }

    public static ObjetoParaOArray[] mergeArrays(ObjetoParaOArray[] array1, ObjetoParaOArray[] array2) {
        ObjetoParaOArray[] mergedArrays = new ObjetoParaOArray[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergedArrays[i] = array1[i];
        }

        int k = array1.length;

        for (int j = 0; j < array2.length; j++) {
            mergedArrays[k] = array2[j];
            k++;
        }

        for (ObjetoParaOArray object : mergedArrays) {
            System.out.println(object.value);
        }

        return mergedArrays;
    }
}
