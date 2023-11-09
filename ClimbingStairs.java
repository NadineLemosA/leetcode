package leetCode;

public class ClimbingStairs {
//     Você está subindo uma escada. São necessários n passos para chegar ao topo.
// Você pode subir de 1 ou 2 degraus por vez. De quantas maneiras distintas você pode chegar ao topo?
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