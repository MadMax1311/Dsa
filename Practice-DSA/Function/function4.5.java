import java.util.Scanner;

public class function4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name here: ");
        String name = sc.next();
        // switch(name){
        //     case shyam: System.out.println("Destroy");
        //                 break;
        //     case hiren: System.out.println("Good guy");
        //         break;
        // }
        // default 

        String as = myname(name);
        System.out.println(as);
    }
    static String myname(String name){
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        String msg = "HELLO "+ name;
        return msg;
    }
}
