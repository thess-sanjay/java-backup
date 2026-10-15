

class StringReverse 
{
	public static void main(String[] args) 
	{
		String original = "Hello World!";
		
		StringBuilder sb = new StringBuilder(original);
		StringBuilder ans = sb.reverse();
		
		System.out.println(ans);
	}
}
