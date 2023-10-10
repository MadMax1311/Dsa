package Binarysearch;
public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {-12, -8, -2, 0 , 1 , 4 ,7 , 34, 56, 76, 90, 101};
        int target = -2;
        System.out.println(Search(nums, target));
    }
    static int Search(int arr[] , int target){
        int start = 0;
        int end =  arr.length-1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid -1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
