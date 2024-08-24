class P3 
{
	public static void main(String[] args) 
	{
		smallest(2,3,4,5);
		smallest(69,96,33,22.0);
	}
	public static void smallest(double a,double b,double c,double d){
		if (a<b && a<c && a<d)
		{
			System.out.println(a + " is the smallest number");
		}else if(b<c && b<d){
			System.out.println(b + " is the smallest number");
		}else 
		{
			if(c<d){
				System.out.println(c + " is the smallest number");
			}else {
				System.out.println(d + " is the smallest number");
			}
		}
	}
	
}
