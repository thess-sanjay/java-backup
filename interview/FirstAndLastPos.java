import java.util.*;

class FirstAndLastPos{
    public static void main(String[] args){
        int arr[] = {2,3,4,5,5,6,7,7,8};
        int target = 5;

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[] arr, int target){
        int i=0, j=arr.length-1;
        int ans[] = {-1, -1};

        while(i < j){
            int mid = i + (j-i) /2;

            if(target == arr[mid]){
                ans[0] = mid;
                j = mid -1;
            }
            else if(target < arr[mid]){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }

        i = 0;
        j = arr.length -1;

        while(i < j){
            int mid = i + (j-i) / 2;

            if(target == arr[mid]){
                ans[1] = mid;
                i = mid + 1;
            }
            else if(target < arr[mid])
                j = mid -1;
            else
                i = mid + 1;
        }
        return ans;
    }
}