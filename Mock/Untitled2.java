class Demo 
{
	public static void main(String[] args) 
	{
		String s1 = "0123456789";
		String s2 = "4361";
		
		int count = 0;
		
		for(int i=0; i<s2.length(); i++){
			
			char ch = s2.charAt(i);
			
			for(int j=0; j<s1.length(); j++){
				
				if(ch != s1.charAt(i)){
					j++;
					count++;	
				}
			}
		}
	}
}
