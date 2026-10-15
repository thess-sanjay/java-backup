class BinarySearch 
{
	public static int Search(int[] arr, int target)
	{
		int i=0, j=arr.length-1;
		
		while(i<=j){
			int mid = (i+j)/2;

			if(arr[mid] == target)
				return arr[mid];
			else if(target < arr[mid])
				j = mid - 1;
			else
				i = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,11,12,13,14};
		int target = 14;
		
		int ans = Search(arr, target);
		System.out.println(ans);
	}
}
