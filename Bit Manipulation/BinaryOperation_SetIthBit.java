public class BinaryOperation_SetIthBit {
    public static int setIthBit(int n,int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        /*
         * number = 1010   and if i=2
         * then for set ith value 1 of number n ,
         *  we do n | (1 << i)
         *    1010
         *  | 0100 = (1 << i)
         *   -------
         *    1110
         * 
         */
        //Code
        System.out.println((setIthBit(10, 2))); //14
        /*
         * explanation
         * 10 | (1 << 2)    A=1010
         *   1010
         * | 0100
         * -------
         *   1110  = 2^3 + 2^2 + 2^1 = 8+4+2 = 14
         */

    }
}
