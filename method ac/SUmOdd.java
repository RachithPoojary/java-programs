import java.util.*;

class SumOdd 
{
	public static void main(String[] args) 
	{
		sum();

	}
	public static void sum(){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum1=0;
		for(int i = 1;i<+n;i++){
			if(i%2!=0){
				 sum1 = sum1+i;
			}
		}
		System.out.println(sum1 + " is sum of all odd numbers from 1 to n.");
	}
}



