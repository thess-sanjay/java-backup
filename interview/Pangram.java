class Pangram{
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean characters[] = new boolean[26];
		
		for(int i=0; i<sentence.length(); i++){
			
			characters[sentence.charAt(i) - 'a'] = true;
		}
		
		boolean result = true;
		
		for(boolean ans : characters){
			
			if(ans == false){
				result = false;
			}
		}
		
		if(result)
			System.out.println("Its a pangram");
		else
			System.out.println("Its not a pangram");
    }
}