import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int a = sc.nextInt();
        int count = 0;
        
        for (int i = 2;i<+a/2;i++){
            if(a%i==0){
                count++;
            }else{
                i++;
            }
            
        }
        if(count==0){
            System.out.println("prime");
        }else {
            System.out.println("not a prime");
        }


    }
    
}
