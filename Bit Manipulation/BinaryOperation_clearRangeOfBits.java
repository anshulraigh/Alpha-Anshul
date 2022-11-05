public class BinaryOperation_clearRangeOfBits {
    public static int clearBitsInRange(int n,int i,int j){
        int a = ((~0) << (j+1));
        int b = (1 << i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        /*
         * n = 100111010011 , i =2 , j = 7
         *    1 0 0 1 1 1 0 1 0 0 1 1
         *            |         |
         *           i=7       i=2
         * Result after clearing -->
         *    1 0 0 1 0 0 0 0 0 0 1 1
         * 
         * Approach --> a|b
         * a = 111100000000  can get this by ((~0) << j+1)
         *        |
         *       j+1
         * b = 000000000011  can get this by (1 << i)-1 and this equal to 2^i-1-1
         *               |
         *              i-1
         *             
         *         01 = (1) = 2^1-1
         *        011 = (3) = 2^2-1
         *       0111 = (7) = 2^3-1
         *      01111 = (15) = 2^4-1
         *     011111 = (31) = 2^5-1
         */
        //Code
        System.out.println(clearBitsInRange(10,2,4));// 2
    }
}
