class  P1 
{
	public static void main(String[] args) 
	{
		largest(25.5,35.5,2.5);
	}
	public static void largest(double a,double b,double c){
		if (a>b ){
			if(a>c){
				System.out.println("The largest number is "+a);
			}else{
				System.out.println("The largest number is "+c);

			}
		}else {
			
			System.out.println("The largest number is "+b);
		}
	}
}