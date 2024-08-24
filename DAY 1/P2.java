class p2 
{
	public static void main(String[] args) 
	{
		paisa(250,210,450);
	}
	public static void paisa(double ambani,double adani, double tata)
	{
		if (ambani>adani && ambani>tata)
		{
			System.out.println("ambani is the richest");
		}else {
			if(adani>tata)
			{
			System.out.println("adani is the richest");
			}else{
				System.out.println("tata is the richest");
			}
}
	}
}
