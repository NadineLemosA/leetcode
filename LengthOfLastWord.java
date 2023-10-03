package leetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   voe-me para a lua  "));
    }

    public static int lengthOfLastWord(String s) {
        int lengthLastString = 0;
        char[] charactersS = s.toCharArray();
        boolean lastWord = false;

        for (int i = charactersS.length - 1; i >= 0; i--) {
            if (charactersS[i] != ' ') {
                lastWord = true;
            }

            if (lastWord && charactersS[i] != ' ') {
                lengthLastString++;
            }

            if (lastWord && charactersS[i] == ' ') {
                i = -1;
            }
        }

        return lengthLastString;
    }
}