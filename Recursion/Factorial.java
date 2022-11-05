public class Factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        // int fnm1 = fact(n-1);
        // int fn = n * fnm1; 
        // in place of code of line no. 6,7 we can use only code of line 9
        int fn = n * fact(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 5; // 125
        System.out.println(fact(n));
    }
}
