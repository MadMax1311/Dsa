public class Searchin2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
       int target = 3;
       System.out.println(searchMatrix(matrix , target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;  //no of rows
        int col = matrix.length-1; //no of colum

        int start = 0; 
        int end = row * col -1; //

        if(matrix == null || matrix.length== 0 || matrix.length-1 == 0)
            return false;
        while (start <= end){ 
            int mid = start + (end - start) / 2;
            int im = matrix[mid / col][mid % col];

            if(im == target){
                return true;
            }
            if(im > target)
                end = mid -1;
                // return true;
            if(im < target){
                start = start + 1;
                // return true;
            }
        }
        return false;
    }
}
