package BinarySearch;

public class PeakValue18_08_23 {
    public static void main(String[] args) {
     int[] nums ={1,2,3,1};
     System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i-1]<nums[i]){
                return i;
            }
        }
        return 0;
    }
}
