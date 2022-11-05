public class ConvertUpperCaseCharactersToLowerCase {
    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
        // System.out.println((int)'A'); // 65  =  1000001
        // System.out.println((int)' '); // 32  = | 100000
        // System.out.println((int)'a'); // 97  =  1100001
    }
}
