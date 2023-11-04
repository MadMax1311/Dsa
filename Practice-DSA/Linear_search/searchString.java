public class searchString {
    public static void main(String[] args) {
        String name = "shyam";
        char ch = 'n';
        System.out.println(string(name, ch));
    }
    static boolean string(String str, char target){
        if(str.length() == 0 ){ // length() means the function nd length is a variable
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
