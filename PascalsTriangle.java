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
        List<Integer> numbersSecondLineTriangle = Arrays.asList(1,1);
        int secondLineSize = numbersSecondLineTriangle.size() - 1;

        if (numRows == 1) {
            listOfLists.add(numbersFirstLineTriangle);
            return listOfLists;
        }

        if (numRows == 2) {
            listOfLists.add(numbersFirstLineTriangle);
            listOfLists.add(numbersSecondLineTriangle);
            return listOfLists;
        }

        listOfLists.add(numbersFirstLineTriangle);
        listOfLists.add(numbersSecondLineTriangle);

        while (listOfLists.size() != numRows) {
            List<Integer> arrayOrigem = new ArrayList<>();
            arrayOrigem.add(1);
            arrayOrigem.add(1);

            for (int i = 0; i < secondLineSize; i++) {
                Integer addedNumbers = numbersSecondLineTriangle.get(i) + numbersSecondLineTriangle.get(i + 1);
                arrayOrigem.add(1, addedNumbers);
            }

            secondLineSize = arrayOrigem.size() - 1;
            listOfLists.add(arrayOrigem);
            numbersSecondLineTriangle = new ArrayList<>(arrayOrigem);
        }

        return listOfLists;
    }
}
