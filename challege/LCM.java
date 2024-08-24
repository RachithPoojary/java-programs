import java.util.*;

public class LCM {
    public static void main(string[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first number=");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number=");
        int n2 = sc.nextInt();
        int value = lcm(n1,n2);
        System.out.println("LCM of the given 2 numbers is " + value);

    }
    public static int lcm(int n1,int n2){

        int count = 0;
        for (int  i =n1>n2?n1:n2;i<(n1*n2);i++ ){
            if(i%n1==0 && i%n2==0){
                 count = i;
                return count;
            }
        }
        return count;

    }
}
