import java.util.Scanner;
public class function2 {
    public static void main(String[] args) {
        // int ans = sum2();
        // System.out.print("Your sum is: "+sum2());
        System.out.println("your sum is: "+sum3(20,50));
    }
    // static int sum2(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the num1: ");
    //     int num1 = sc.nextInt();
    //     System.out.print("Enter the num2: ");
    //     int num2 = sc.nextInt();
    //     // int s = num1 + num2;
    //     return num1+num2;
    // }
    static int sum3(int i, int j){
        Scanner sc = new Scanner(System.in);
        // i = sc.nextInt();
        // j = sc.nextInt();
        // int sum =0;
        return i+j;
        // return sum;
    }
}
