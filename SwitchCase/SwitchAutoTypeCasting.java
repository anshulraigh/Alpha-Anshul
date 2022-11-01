public class SwitchAutoTypeCasting {
   /// here we get occurance of auto type casting from byte to integer.
    public static void main(String[] args) {
        byte b=20;
        switch (b+0) {
            case 20:
                System.out.println("oh yeah!");
                break;
            case 2000: // cannot convert from int to byte 
                // so if we use switch(b+0) no error occur cause + and 0 are of type integer.
                // so the expression will take place with big data type which is integer here not byte.
                System.out.println("oh yeah!");
                break;
        
            default:
                break;
        }
    }
}
