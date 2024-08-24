import java.util.Scanner;

public class reverse {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = sc.nextInt();
        int ulta = rev(num);
        System.out.println(ulta);
    }
    public static int rev(int num){
        int ulta=0;
        while(num>0){
            int i =num % 10 ;
            ulta = ulta*10 + i;
            num /=10;


        }


        return ulta;

    }




}
