package leetCode;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ab_a"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        // System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        String sFormatted = s.replaceAll("_", "").replaceAll("[^a-zA-Z_0-9]", "");
        String sInverted = new StringBuilder(sFormatted).reverse().toString();

        if (sFormatted.equalsIgnoreCase(sInverted)) {
            return true;
        } else {
            return false;
        }
    }
}
