package leetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello word"));
        System.out.println(lengthOfLastWord("voe-me para a lua  "));
        System.out.println(lengthOfLastWord("luffy ainda é joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        int lengthLastString = 0;
        char[] charactersS = s.toCharArray();

        for (int i = charactersS.length - 1; i > 0; i--) {

            if (charactersS[i] != ' ') {
                lengthLastString = lengthLastString + 1;
            } else {
                i = 0;
            }
        }

        return lengthLastString;
    }
}