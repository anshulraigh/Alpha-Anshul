public class Swapping_without_thirdVariable {
    public static void main(String[] args) {
            int x = 3, y = 4;
            System.out.println("Before swap: x = " + x + " and y = " + y);
            //swap using xor
            x = x ^ y;
            y = x ^ y;
            x = x ^ y;
            System.out.println("After swap: x = " + x + " and y = " + y);
    }
}
