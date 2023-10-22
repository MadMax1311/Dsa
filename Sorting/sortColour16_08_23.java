
import java.util.Arrays;

public class sortColour16_08_23{
    public static void main(String[] args) {
     int[] nums = {2,0,2,1,1,0};
    sortColors(nums);
     System.out.println(Arrays.toString((nums)));
    }
    public static void sortColors(int[] nums) {
        // here this for loop is used for the pass like pass = 0, pass = 1
        for (int i = 0; i < nums.length - 1; i++) {
            // here this for loop is used for every time check the j's left side value
            for (int j = i+1; j > 0 ; j--){
                /* ex [5,4,3,2,1];
                then for 1 time j = 0 + 1 = 1 this one is show index and then above ex 1 index element is 4 then j - 1 = 1 -1 = 0
                so the 0 index element is bigger then 1 index so swap it
                */
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}
