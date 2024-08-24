import java.util.Scanner;

public class prime {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = sc.nextInt();

        int count = pprime(num);
        if (count==0)
            System.out.println("the number is a prime number");
        else
            System.out.println("The number is not a prime number");
    }
    public static int pprime(int num){
        int count = 0;
        for (int i = 2;i<num;i++){
            if(num%i == 0){
                count++;}

        }
        return count;

    }
}
