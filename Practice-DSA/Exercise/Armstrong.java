// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(isArmstrong(n));

        for(int i = 100; i<1000; i++){// used for all 3 digits armstrong number
            if(isArmstrong(i))
            System.out.print(i + " ");
        }
    }
    static boolean isArmstrong(int n){
        // Scanner sc = new Scanner(System.in);
        int original = n;
        int sum =0;
        while(n > 0){
            int rem = n % 10;
            n = n/10;
            int cube = rem*rem*rem;
            sum = sum + cube;
        }
        if( sum == original){
            return true;
        }
        return false;

    }
    
}
