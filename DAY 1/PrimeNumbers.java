import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int m = sc.nextInt();
			
        int n = sc.nextInt(); 
	int count=0;
                
        for (int i = m; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                
		count++	;	
		            }
        }
	System.out.print(count);
    }
}