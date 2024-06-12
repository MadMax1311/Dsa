import java.util.*;
public class avgfun {
    public static void avgfu(int a, int b, int c){
        int n=3;
        int avg = (a+b+c)/n;
        System.out.print(avg);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.print("The avg is= ");
        avgfu(a,b,c);
    }
    
}
