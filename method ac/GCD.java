//Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.Scanner;

class GCD 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number=");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number=");
		int num2 = sc.nextInt();
		
		int n = num1<num2?num1:num2;

		for(int gcd=n;gcd>=1;gcd--){
		if(num1%gcd==0 && num2%gcd == 0){
			System.out.println("The greatest common devisor of "+num1+ " and "+ num2+ " is "+ gcd);
			break;
		}
		
		}
	}
}
