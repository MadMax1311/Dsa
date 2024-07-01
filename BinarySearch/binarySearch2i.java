package Binarysearch;
public class binarySearch2 {
    public static void main(String[] args) {
        int nums [] = {90, 78, 56 ,45, 34,23,12,9,5,3,1};
        int target = 34;
        System.out.println(Search(nums, target));
    }
    static int Search(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2 ;

            if (target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                end = mid - 1;
            }
            if(target < arr[mid]) 
                start = mid + 1;
         }
        return -1;
    }
}
