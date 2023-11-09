package leetCode;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(7));
    }

    public static int climbStairs(int n) {
        int firstNumber = 1;
        int secondNumber = 1;
        int result = firstNumber + secondNumber;

        if (n == 1 || n == 2) {
            return n;
        }

        for (int i = 3; i <= n; i++) {
            firstNumber = secondNumber;
            secondNumber = result;
            result = firstNumber + secondNumber;
        }

        return result;
    }
}