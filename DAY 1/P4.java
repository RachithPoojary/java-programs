class P4 
{
	public static void main(String[] args) 
	{
		
	largest(2,3,4,5,6);
	smallest(2,3,4,5,6,1);
	largest(2,3,4,5,6,7,8);
	}
	public static void largest(double a,double b,double c,double d,double e){
		if (a>b && a>c && a>d && a>e)
		{
			System.out.println(a + " is the largest number");
		}else if(b>c && b>d && b>e){
			System.out.println(b + " is the largest number");
		}else {
			if(c>d && c>e){
				System.out.println(c + " is the largest number");
			}else if (d>e){
			 System.out.println(d + " is the largest number");
			}else 
			{System.out.println(e + " is the largest number");
			}
		}
	}
		public static void smallest(double a,double b,double c,double d,double e,double f){
		if (a<b && a<c && a<d && a<e && a<f)
		{
			System.out.println(a + " is the smallest number");
		}else if(b<c && b<d && b<e && b<f){
			System.out.println(b + " is the smallest number");
		}else 
		{
			if(c<d && c<e && c<f){
				System.out.println(c + " is the smallest number");
			}else {
				if(d<e && d<f)
				{
				System.out.println(d + " is the smallest number");
				}else if (e<f)
				{
					System.out.println(e + " is the smallest number");
				}else
				{
					System.out.println(f + " is the smallest number");
				}
			}
		}
		}
		public static void largest(double a,double b,double c,double d,double e,double f,double g){
		if (a>b && a>c && a>d && a>e && a>f && a>g)
		{
			System.out.println(a + " is the largest number");
		}else if(b>c && b>d && b>e && b>f && b>g){
			System.out.println(b + " is the largest number");
		}else {
			if(c>d && c>e && c>f && c>g){
				System.out.println(c + " is the largest number");
			}else if (d>e && d>f && d>g){
			 System.out.println(d + " is the largest number");
			}else 
			{
				if(e>f && e>g){
					System.out.println(e + " is the largest number");
			}else if (f>g){
				System.out.println(f + " is the largest number");
			}
			else{
				System.out.println(g + " is the largest number");
			}
		}
		}
		}

}