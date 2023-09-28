package leetCode;

import java.util.ArrayList;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "pi"));
        // System.out.println(strStr("mississippi", "issip"));
    }

    public static int strStr(String haystack, String needle) {
        char[] charactersHaystack = haystack.toCharArray();
        char[] charactersNeedle = needle.toCharArray();
        String combination = "";
        ArrayList<Integer> indexList = new ArrayList<>();
        int indice = -1;
        int i = 0;
        int j = 0;

        for (i = 0; i < charactersHaystack.length; i++) {

            if (charactersNeedle[j] == charactersHaystack[i]) {
                combination = combination + String.valueOf(charactersNeedle[j]);
                indexList.add(i);

                if (j < charactersNeedle.length - 1) {
                    j++;
                }
            } else {

                if (!indexList.isEmpty()) {
                    i = indexList.get(0);
                }

                combination = "";
                indexList.clear();
                j = 0;
            }

            if (needle.equals(combination)) {
                indice = indexList.get(0);
                i = charactersHaystack.length;
            }
        }

        return indice;
    }
}