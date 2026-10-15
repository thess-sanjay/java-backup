class LongestCommonPrefix
{
	public static void main(String[] args)
	{
		String[] a = {"flight", "flower", "flow"};
		
		String prefix = a[0];
		
		for(int i=1; i<a.length; i++){
			
			while(!a[i].startsWith(prefix)){
				
				prefix = prefix.substring(0, prefix.length()-1);
				
				if(prefix.isEmpty())
					break;
			}
		}
		System.out.println(prefix);
	}
}