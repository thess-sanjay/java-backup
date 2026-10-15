class CoundDigits 
{
	public static void main(String[] args) 
	{
		int n = 1234;
		int count = 0;
		
		while(n>0)
		{
			int ld = n % 10;
			count++;
			n/=10;
		}
		System.out.println(count);
	}
}
