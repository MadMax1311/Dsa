import java.util.Arrays;

public class linearmax2Darray{
    public static void main(String[] args) {
        int [][] nums ={
            {23,45,-7},
            {234,7,89,0},
            {23,554,67,24,1}
        };
        int ans = max(nums);
        System.out.println(max(nums));
    }
    static int max(int arr [][]){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}