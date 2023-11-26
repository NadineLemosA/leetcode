package leetCode;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ab_a"));
        // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        // System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        String sFormatada = s.replaceAll("[^a-zA-Z_0-9]", ""); // verificar como retirar o anderline
        System.out.println(sFormatada);
        String sInvertida = new StringBuilder(sFormatada).reverse().toString();
        System.out.println(sInvertida);

        if (sFormatada.equalsIgnoreCase(sInvertida)) {
            return true;
        } else {
            return false;
        }
    }
}
