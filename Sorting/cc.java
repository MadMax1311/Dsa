import java.util.Arrays;

public class cc {

    static int[] squares = fillSquares();

    static int[] fillSquares() {
        int[] res = new int[46340 + 1];
        for (int i = 1; i < res.length; i++) {
            res[i] = i * i;
        }
    return res;
    }

    public boolean isPerfectSquare(int num) {
        return Arrays.binarySearch(squares, num) > 0;
    }
}
