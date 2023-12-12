import java.util.Arrays;

public class Overloading { // means same name but both parameters are different  & it use in compile time
    public static void main(String[] args) {
        fun(12);
        fun("shyam");
        demo(12,123,24,4,5,3,5,5,4,646,66,5,65,65656);
        demo("shya", "dsjihu","fsfh","suresh");
        //demo(); // empty can create error bcoz it cant be understand which function can run
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String nam){
        System.out.println(nam);
    }

    static void demo(int...v){// varibale length argument in arrays 
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
}
