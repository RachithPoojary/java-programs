import java.util.Scanner;

class Vote
{
	public static void main ( String [] args){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age <18)
		{
			System.out.println("u r not eligible for voting");
		}else
		{
			System.out.println("You are eligible for voting");
}}}