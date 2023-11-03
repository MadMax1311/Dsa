import java.util.Arrays;


public class Linearsearch {
    public static void main(String[] args) {
        int[] nums = {23,234,45,65,4,543,34,65,69,76,545};
        int target = 234;
        System.out.println(Search(nums, target));
        // int[] arr = nums;
        // System.out.println(Arrays.toString(arr));
        // arr[0] = 1;
        //         System.out.println(Arrays.toString(nums));
        

    }
    // for the index return 
//     static int Search(int[] arr, int target){

//         if(arr.length == 0){
//             return -1;
//         }

//         for (int i = 0; i < arr.length; i++) {
//                 // int element = arr[i];
//                 if(arr[i] == target){
//                 return i;
//         }
//     }
//     return -1;
// // arr = nums
//     }
// }
//  return the element
 static int Search(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if(element == target){
                return element;
        }
    }
    return -1;
// arr = nums
    }
}