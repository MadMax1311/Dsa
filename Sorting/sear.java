// package Sorting;

public class sear {
    public static void main(String[] args) {
        int[] nums = {10,5,5,-5,-5,10,-10};
        System.out.println(max(nums, nums.length));
    }
    // static int print2largest(int arr[], int n){

    // }
    static int max(int[] arr , int n){
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        // int element = 0;
        if(n > 2){
        for (int i = 0 ; i <= n - 1; i++) {
            //  element = arr[i];
            if(max < arr[i]){
                secmax = max;
                max = arr[i] ;
            }
            else if (secmax < arr[i] ) {
                secmax = arr[i];
            }

            if(max == secmax) return -1;
        }
        return secmax;
        }
        else {
            System.out.println("Invlid");
            return 0;
        }
    }

}
