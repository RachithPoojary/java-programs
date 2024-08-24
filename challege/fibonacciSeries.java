import java.util.Scanner;
public class fibonacciSeries {

    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = sc.nextInt();
        fib(num);
    }
    public static void fib(int num){
        int a =0;
        int b= 1;
        int c = a+b;
        int i =0;

        while(i<num){
            System.out.print(a + "  ");
            a=b;
            b=c;
            c=a+b;
            i++;
        }

    }
}
