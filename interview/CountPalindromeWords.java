class CountPalindromeWords 
{
	public static boolean isPalindrome(String word){
		
		int i=0, j=word.length()-1;
		
		while(i < j){
			if(word.charAt(i) != word.charAt(j)){
				return false;	
			}else{
				i++;
				j--;
			}
			}
			return true;
	}
	
	public static int countPalindrome(String s){
		
		s = s + " ";
		int count = 0;
		String word = "";
		
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i) != ' '){
				word += s.charAt(i);
			}else{	
				if(isPalindrome(word)){
					count++;
				}
				word = "";
			}
			
		}
		return count;
	}
	
	
	public static void main(String[] args) 
	{
		String s1 = "madam arora teaches malayalam";
		String s2 = "nitin speaks malayalam";
		
			System.out.println(countPalindrome(s1));

			System.out.println(countPalindrome(s2));
	}
}
