class StrPalindrome 
{
	public static void main(String[] args) 
	{
		String str = "RACECAR";
		
		
		StringBuilder sb = new StringBuilder(str);
		String ans = sb.reverse() .toString();
		
		if(str.equals(ans))
			System.out.println("Its a Palindrome");
		else
			System.out.println("Its not a Palindrome");
	}
}
