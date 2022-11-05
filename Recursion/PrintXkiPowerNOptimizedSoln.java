public class PrintXkiPowerNOptimizedSoln {
    public static void main(String[] args) {
        System.out.println(optimizePower(2,10));
    }
    public static int optimizePower(int a, int n){
        if(n == 0){
            return 1;
        }
        // int halfPwerSq = optimizePower(a, n/2) * optimizePower(a, n/2); // O(n)
        //  to make time coplexity to O(logn)
        // we use code of line 12 , 13 in place of line 9
        int halfPwer = optimizePower(a, n/2);
        int halfPwerSq = halfPwer * halfPwer;
        
        // n is odd then 
        if (n%2 != 0) {
            halfPwerSq = a * halfPwerSq;
        }
        return halfPwerSq;
    }
}
