package Binarysearch;
public class ascdscbinary {
    public static void main(String[] args) {
        // int[] nums = {90,90, 78, 56 ,45, 34,23,12,9,5,3,1};
        int[] nums = {-12, -8, -2, 0 , 1 , 4 ,7 , 34, 56, 76, 90, 101};
        int target = 90;
        System.out.println(isAsc(nums, 0));
        System.out.println(Search(nums, target));   
    }
    static boolean isAsc(int arr[] , int target){
        int start =0;
        int end = arr.length -1;

        if(arr[start] < arr[end]){
        return true;
        }
        else
        { return false;}

    }
    static int Search(int arr [], int target){
        int start =0;
        int end = arr.length -1;

        // boolean isAsc;
        // if(arr[start] < arr[end])
        // isAsc =  true;
        // else 
        // isAsc = false;

         while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
            return mid;

            if(target < arr[mid])
            end = mid - 1;

            if(target > arr[mid])
            start = mid + 1;
         }
         return -1;
    }
}
