public class BinaryOperation_Update_ith_bit {
    public static int updateIthBit(int n,int i,int newBit){
        if(newBit == 0){
            return clearIthBit( n, i);
        }else{
            return setIthBit(n, i);
        }
    }
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2,1)); //14
    }
}
