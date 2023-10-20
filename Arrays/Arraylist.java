import java.util.ArrayList;

public class Arraylist{
    public static void main(String[] args) {        //here initalcapacity is 3 its doesnt means you only enter 3 integers 
        ArrayList<Integer> list = new ArrayList<>(3); // here the Integer is called wraper class we only use 
                                                                      //wrapper class not primitive datatype like int etc..

            list.add(454);
            list.add(4);
            list.add(489);
            list.add(778);
            list.add(99);
            // System.out.println(list.contains(778));
            // System.out.println(list.contains(100));
            System.out.println(list);

            // modify also
            list.set(1 , 100);// here 1 is shown index and 100 is element
            System.out.println(list);

            list.remove(4);
            System.out.println(list);
            
    }
}