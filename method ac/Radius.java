import java.util.Scanner;

class Radius
{
	public static void main(String [] args){
		circumference();

}
	public static void circumference(){
		Scanner sc = new Scanner (System.in);
		int rad = sc.nextInt();

		double cir = 2* 3.14 * rad;
		System.out.println ("Circumference of the circle is " + cir);
	}
}