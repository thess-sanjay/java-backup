class  NumPalindrome
{
	public static void main(String[] args) 
	{
		int n = 1221;
		int original = n;
		int rev = 0;
		
		while(n>0)
		{
			int ld = n % 10;
			rev = rev * 10 + ld;
			n/=10;
		}
		if(rev == original)
			System.out.println("Its a Palindrome");
		else
			System.out.println("Its not a Palindrome");
	}
}
