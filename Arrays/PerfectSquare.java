public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
    }
    static boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        for (int i = 1; i<= num/2; i++) {
            // if(num % i ==0 && num / i == i){
            //     return true;
            // }
            if(i*i == num ) return true;
        }    
        return false;
    }
}
