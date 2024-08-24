/*
Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the 
power of another i.e. xn.
*/

import java.util.Scanner;

class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		System.out.println("Enter the value of n");
		int n = sc.nextInt();

		int value = x;

		for(int i = 1; i<n;i++){
			value = value*x;
	}
	System.out.println("Value of " + x + " to the power " + n + " is " + value );
}
}
