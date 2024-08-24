import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double arm = Add(num);
        System.out.println(arm);
        if (arm == num)
            System.out.println(num + " is an armstrong number");
        else
            System.out.println(num + " is not an armstrong number");

    }
    static int length(int num){
        int i = 0;
        while(num>0){
            num = num/10;
            i += 1;
        }
        return i;
    }
    static double Add(int num){
        double add= 0;
        int len = length(num);

        while (num>0){


            int i = num%10;

          add = add + Math.pow(i,len);
            num /=10;

        }

        return add;
    }
}
