package leetCode;

import java.util.ArrayList;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
    }

    public static int strStr(String haystack, String needle) {
        char[] charactersHaystack = haystack.toCharArray();
        char[] charactersNeedle = needle.toCharArray();

        String combination = "";
        int indice = -1;
        ArrayList<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < charactersHaystack.length; i++) { // excedendo o limite
            for (int j = 0; j < charactersNeedle.length; j++) {
                System.out.println("i: " + i);
                System.out.println("j: " + j);
                if (charactersHaystack[i] == charactersNeedle[j]) {
                    combination = combination + String.valueOf(charactersNeedle[j]);
                    indexList.add(i);
                    System.out.println("combinação: " + combination);
                    i++;
                } else {
                    combination = "";
                }
            }
        }

        if (needle.equals(combination)) {
            indice = indexList.get(0);
        }

        System.out.println("indice:" + indice);
        System.out.println(indexList);

        return indice;
    }
}