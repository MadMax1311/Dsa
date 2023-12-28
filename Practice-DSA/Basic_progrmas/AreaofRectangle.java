package Basic_progrmas;
import java.util.*;
public class AreaofRectangle {
    public static void main(String[] args) {
        double num = isRow();
        System.out.print(isRow());
    }
    static double isRow(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length: ");
        double l = sc.nextDouble();
        System.out.print("enter the width: ");
        double w = sc.nextDouble();
        double sum = l*w;
        return sum;
        // return sum;
}
}

