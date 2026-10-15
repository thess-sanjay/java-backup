class StringDecoding 
{
	public static void main(String[] args) 
	{
		String str = "a3b2c4d5";
		
		for(int i=0; i<str.length(); i+=2)
		{
			char ch = str.charAt(i);
			
			int num = str.charAt(i+1) -'0';
			
			for(int j=0; j<num; j++)
			{
				System.out.println(ch);
			}
		}
	}
}
