9class FindFrequency 
{
	public static void main(String[] args) 
	{
		for(int i=0; i<=9; i++)
	{
		int num = 502512;
		
		int count = 0;
		while(num > 0)
		{
			int ld = num % 10;
			
			if(ld == i)
				count++;
			
			num/=10;
		}
		if(count > 0)
			System.out.println(i + "=" + count);
	}
	}
}
