package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle2 {

    public static void main(String[] args) {
        System.out.println(getRow(1));
        System.out.println(getRow(2));
        System.out.println(getRow(3));
        System.out.println(getRow(5));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> numbersFirstLineTriangle = Arrays.asList(1);
        List<Integer> numbersSecondLineTriangle = Arrays.asList(1, 1);
        int secondLineSize = numbersSecondLineTriangle.size() - 1;

        if (rowIndex == 0) {
            return numbersFirstLineTriangle;
        }

        if (rowIndex == 1)
            return numbersSecondLineTriangle;

        int counter = 1;

        while (counter != rowIndex) {
            List<Integer> arrayOfSums = new ArrayList<>();
            arrayOfSums.add(1);
            arrayOfSums.add(1);

            for (int i = 0; i < secondLineSize; i++)
                arrayOfSums.add(1, numbersSecondLineTriangle.get(i) + numbersSecondLineTriangle.get(i + 1));

            secondLineSize = arrayOfSums.size() - 1;
            numbersSecondLineTriangle = new ArrayList<>(arrayOfSums);
            counter++;
        }

        return numbersSecondLineTriangle;
    }
}
