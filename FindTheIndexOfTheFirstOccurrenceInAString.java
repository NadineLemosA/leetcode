package leetCode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        char[] charactersHaystack = haystack.toCharArray();
        char[] charactersNeedle = needle.toCharArray();

        String combination = "";
        int indice = -1;

        for (int i = 0; i < charactersNeedle.length; i++) {
            for (int j = 0; j < charactersHaystack.length; j++) {
                System.out.println("i: " + i);
                System.out.println("j: " + j);
                if (charactersNeedle[i] == charactersHaystack[j]) {
                    combination = combination + String.valueOf(charactersHaystack[j]);
                    System.out.println(combination);
                    i++;
                }
            }
        }

        return indice;
    }
}
