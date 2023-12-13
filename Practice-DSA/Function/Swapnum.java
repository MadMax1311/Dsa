import java.util.Scanner;

public class Swapnum {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int num = swap();
        System.out.print(num);
        
        // Swap num
        // int tmp = a;
        // a = b;
        // b=tmp;
        // System.out.println("swap num is: "+a+ " " +b);
    }
    static int swap(){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc. nextInt();
        int tmp = a;
        a = b;
        b =tmp;
        return 0;
    }
}
