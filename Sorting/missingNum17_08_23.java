import java.util.Arrays;
public class missingNum17_08_23 {
    public static void main(String[] args) {
        int[] nums = {4,3,1,0};
        // int ans = sort(nums);
        System.out.println(sort(nums));
    }
    // when we give a que like find 1 to n numbers missing numbers means when we see 1 to n condition always do cyclicsort
    static int sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums ,i , correct);
            }
            else i++;
        }
        // for search
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] != j){
                    return j;
                }
            }
        // case 2
        return nums.length;
    }
    static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
