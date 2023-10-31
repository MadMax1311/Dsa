import java.util.Arrays;

public class linear2Darray {
    public static void main(String[] args) {
        int[][] nums = {
            {23,45,-7},
            {234,7,89,0},
            {23,54,67,24,1}
        };
        int target = 2;
        int [] ans = Find(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Find(int arr[][] , int target){
        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j]==target)
                    return new int[]{i ,j};
                }
        }
        return new int[]{-1 ,-1};
    }
}
