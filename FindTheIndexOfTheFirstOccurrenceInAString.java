package leetCode;

import java.util.ArrayList;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "pi"));
    }

    public static int strStr(String haystack, String needle) {
        char[] charactersHaystack = haystack.toCharArray();
        char[] charactersNeedle = needle.toCharArray();
        String validCombination = "";
        ArrayList<Integer> indexList = new ArrayList<>();
        int indexFirstValidCombination = -1;
        int counterHaystack = 0;
        int counterNeedle = 0;

        for (counterHaystack = 0; counterHaystack < charactersHaystack.length; counterHaystack++) {

            if (charactersNeedle[counterNeedle] == charactersHaystack[counterHaystack]) {
                validCombination = validCombination + String.valueOf(charactersNeedle[counterNeedle]);
                indexList.add(counterHaystack);

                if (counterNeedle < charactersNeedle.length - 1) {
                    counterNeedle++;
                }
            } else {

                if (!indexList.isEmpty()) {
                    counterHaystack = indexList.get(0);
                }

                validCombination = "";
                indexList.clear();
                counterNeedle = 0;
            }

            if (needle.equals(validCombination)) {
                indexFirstValidCombination = indexList.get(0);
                counterHaystack = charactersHaystack.length;
            }
        }

        return indexFirstValidCombination;
    }
}