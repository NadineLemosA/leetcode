package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        // System.out.println(generate(1));
        // System.out.println(generate(3));
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> numbersFirstLineTriangle = Arrays.asList(1);
        List<Integer> numbersSecondLineTriangle = Arrays.asList(1, 1);
        int secondLineSize = numbersSecondLineTriangle.size() - 1;

        if (numRows == 1) {
            listOfLists.add(numbersFirstLineTriangle);
            return listOfLists;
        }

        if (numRows == 2) {
            addsFirstTwoLinesToList(listOfLists, numbersFirstLineTriangle, numbersSecondLineTriangle);
            return listOfLists;
        }

        addsFirstTwoLinesToList(listOfLists, numbersFirstLineTriangle, numbersSecondLineTriangle);

         while (listOfLists.size() != numRows) {
            List<Integer> arrayOfSums = new ArrayList<>();
            arrayOfSums.add(1);
            arrayOfSums.add(1);

            for (int i = 0; i < secondLineSize; i++) {
                arrayOfSums.add(1, numbersSecondLineTriangle.get(i) + numbersSecondLineTriangle.get(i + 1));
            }

            secondLineSize = arrayOfSums.size() - 1;
            listOfLists.add(arrayOfSums);
            numbersSecondLineTriangle = new ArrayList<>(arrayOfSums);
        }

        return listOfLists;
    }

    public static void addsFirstTwoLinesToList(List<List<Integer>> listOfLists,
            List<Integer> numbersFirstLineTriangle, List<Integer> numbersSecondLineTriangle) {
        listOfLists.add(numbersFirstLineTriangle);
        listOfLists.add(numbersSecondLineTriangle);
    }
}
