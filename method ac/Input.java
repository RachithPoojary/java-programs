/*Write a program to enter the numbers till the user wants and at the end it should display the count of 
  positive, negative and zeros entered. 
*/
import java.util.Scanner;

class Input 
{
	public static void main(String[] args) 
	{
		
		int positive=0,negative = 0,zero = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to enter a number? true or false");
			boolean response = sc.nextBoolean();

		while(response==true){
			
			System.out.println("Enter the number");
			int i = sc.nextInt();
			
			if(i>0)
				positive++;
			else if(i<0)
				negative++;
			else
				zero++;

			System.out.println("Do you want to enter a number? true or false");
		    response = sc.nextBoolean();

			
		}
		
		System.out.println("Number of Positive numbers = " + positive +" negative numbers = " + negative + " zero = " + zero );



	}
}
