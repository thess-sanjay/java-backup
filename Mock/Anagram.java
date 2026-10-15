class Anagram 
{
	public static void main(String[] args) 
	{
		String arr[] = {"eat", "silent", "tea", "listen", "ate"};
		
		String s1[] = new String[arr.length];
		String s2[] = new String[arr.length];
		
		int count[] = new int[26];
		int count2[] = new int[26];
		
		for(int i=0; i<arr.length; i++){
			String word = arr[i];
		
			if(words.length() == 3){
				s1[] = arr[i];
			}else{
				s2[] = arr[i];
			}
		}
		
		String word = "";
		
		for(int j=0; j<s1.length; j++){
			
			word = s1[j];
		} 
		
		String word2 = "";
		for(int n=0; n<s2.length; n++){
			word2 = s2[n];
		}
		
		for(int k=0; k<word.length(); k++){
			
			count[word[k] - 'a']++
			count[word[k+1] - 'a']--;
		}
		
		for(int m=0; m<word2.length(); m++){
			
			count2[word2[m] - 'a']++;
			count2[word2[m+1] - 'a']--;
		}
		
		boolean isAnagram = true;
		
		for(int value : count){
			if(value != 0){
				isAnagram = false;
				break;
			}
		}
		System.out.println(" s1 is Anagram");
		
		boolean isAnagram2 = true;
		
		for(int value : count2){
			if(value != 0){
				isAnagram2 = false;
				break;
			}
		}
		System.out.println(" s2 is Anagram");
		
	}
}




