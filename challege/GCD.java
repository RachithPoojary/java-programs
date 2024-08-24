import java.util.*;

public class GCD {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number :");
        int n2 = sc.nextInt();
        int gcd = gcd(n1, n2);
        System.out.println("GCD of the given 2 numbers is = " + gcd);

    }

    public static int gcd(int n1, int n2) {

        int value = 0;
        for (int i = n1 < n2 ? n1 : n2; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                value = i;
                return value;
            }

        }
        return 0;

    }
}
