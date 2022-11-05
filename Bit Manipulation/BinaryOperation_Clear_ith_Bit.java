public class BinaryOperation_Clear_ith_Bit {
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        /*
         * if i =1 number = 10 = 1010
         *   1010
         * & 1101 --> ~(1 << i)
         * -------
         *   1000 = 8
         */
        //Code
        System.out.println(clearIthBit(10,1)); // 8
    }
}
