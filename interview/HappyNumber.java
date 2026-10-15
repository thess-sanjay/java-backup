class HappyNumber
{
	public static void main(String[] args){
		
		int n = 19;
		
		while(n != 1 && n != 4){
			
			int sum = 0;
			
			while(n > 0){
				int ld = n % 10;
				
				sum += ld * ld;
				n/=10;
			}
			n = sum;
		}
		
		if(n==1)
			System.out.println("Its a Happy Number");
		else
			System.out.println("Its not a Happy Number");
	}
}