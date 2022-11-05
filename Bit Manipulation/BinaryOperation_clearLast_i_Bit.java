public class BinaryOperation_clearLast_i_Bit {
    public static int clearLastIBits(int n,int i){
        int bitMask = (~0) << i; // Or (-1) << i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        /*
         * n = 15 = 1111 , i = 2
         * Result --> 1100
         * Approach --> n & 1100 , we have to make last i bits 0 we can get this 1100 no. by & ((-1) << i) Or & ((~0) << i)
         *   1111
         *  &1100
         *  ------
         *   1100 = 2^3+2^2+ = 8 + 4 = 12
         */
        //Code 
        System.out.println(clearLastIBits(15,2));
    }
}
