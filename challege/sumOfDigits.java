import java.util.Scanner;

public class sumOfDigits {
    public static void main(string[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int dig = Sum(n);
        System.out.println("Sum of the digits in the integer = "+dig);
    }
public static int Sum(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum ;
}
}
