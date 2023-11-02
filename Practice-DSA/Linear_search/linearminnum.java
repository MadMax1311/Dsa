package Linear_search;

public class linearminnum{
    public static void main(String[] args) {
        int[] nums = {1, 23 ,56 -8, -12, 13,4,45,63,45};
        // int [] nums = new int[4];
        System.out.print(min(nums));
    }
    static int min(int [] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}