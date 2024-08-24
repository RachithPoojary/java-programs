//Write a program to print Fibonacci series of n terms where n is input by user

import java.util.Scanner;

class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the value of n = ");
		int n = sc.nextInt();
		
		int a = 0,b=1,c;

		for(int i = 1;i<=n;i++)
		{
			System.out.print(a + " ");
			c=a+b;
			a=b;
			b=c;
		}
}
}
