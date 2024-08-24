import java.util.*;

public class factorial {
    public static void main(string[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long sum =fact(n);
        System.out.println("Factorial of " + n + " is " + sum);


    }
    public static long fact(int n){
        int count = 1;
        for (int i = 2;i<=n;i++){

            count=count*i;
        }
        return count;
    }
}
