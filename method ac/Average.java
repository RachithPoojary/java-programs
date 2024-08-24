import java.util.*;

class Average
{
	public static void main ( String[] args){
		
		average();
	}
	
		public static void average(){
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

			int avg = (a+b+c)/3;
			System.out.println(avg + " is the average ");

		
	}
}