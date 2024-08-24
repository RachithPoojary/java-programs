import java.util.*;

class Greatest
{
	public static void main(String [] args){
		great();
}
public static void great(){
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	if(num1>num2){
		System.out.println(num1 + " is the greatest number");
	}
	else {
		System.out.println( num2 + " is the greatest number");
	}
}
}