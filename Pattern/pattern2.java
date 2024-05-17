import java.util.*;

public class pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int n=4;
        // int m=5;
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {

                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}