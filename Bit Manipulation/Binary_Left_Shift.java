public class Binary_Left_Shift {
    public static void main(String[] args) {
        /*
         * Binay Left Shift  <<
         * Rules 
         * a << b   
         * 5 << 2  A=000101
         * 000101 --> 0101__ --> 010100 = (20)
         * 
         * Forlula for it's ans -->
         * a << b  = a*2^b  , where (^ = power)
         * 5 << 2  = 5*2^2 = 5*4 = 20
         * 
         */
        //Code 
        System.out.println((5 << 2)); // 20
    }
}
