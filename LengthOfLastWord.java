package leetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello word"));
        System.out.println(lengthOfLastWord("luffy ainda é joyboy"));
        System.out.println(lengthOfLastWord("voe-me para a lua  ")); // erro
    }

    public static int lengthOfLastWord(String s) {
        int lengthLastString = 0;
        char[] charactersS = s.toCharArray();

        for (int i = charactersS.length - 1; i > 0; i--) {

            if (charactersS[i] != ' ') {
                lengthLastString = lengthLastString + 1;
                System.out.println("if2: " + lengthLastString);
            } else {
                i = 0;
            }
        }

        return lengthLastString;
    }
}