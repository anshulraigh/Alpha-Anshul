public class SwitchWithChar {
    public static void main(String[] args) {
        int z = 'a';
        switch (z) {
            case 'a':
                System.out.println("1");
                break;
            case 'b':
                System.out.println("2");
                break;
            // case 97: // Duplicate case , because a in integer = 97
            case 20:
                System.out.println("3");
                break;
        
            default:
                break;
        }
    }
}
