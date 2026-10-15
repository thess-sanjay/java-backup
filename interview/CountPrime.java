class CountPrime 
{
		public static boolean isPrime(int n)
		{
			if(n < 2)
				return false;
			
			
			for(int i=2; i<n; i++)
			{
				if(n % i == 0)
					return false;
			}
			return true;
		}
	
	public static void main(String[] args) 
	{	
		int arr[] = {1,2,3,4,3,5,7,6,8,9};
		int count = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(isPrime(arr[i]))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
