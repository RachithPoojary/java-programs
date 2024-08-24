import java.util.*;

class sum{
    public static void main(string[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count = 0;

        for ( int i = 0;i<=n;i++){
            if(i%2!=0){
                 count=count+i;
            }
        }
        System.out.println("Sum of all odd numbers from 1 to n = "+count);
    }
}