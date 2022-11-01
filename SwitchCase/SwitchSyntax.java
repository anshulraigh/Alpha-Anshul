// package SwitchCase;
public class SwitchSyntax {
    public static void main(String[] args) {
        // in place of key we can also give charachters to trigger. instead of 1,2 we
        // can take 'a' , 'b'
        // switch (key) {
        // case value:

        // break;

        // default: // we can specify default anywhere in switch.
        // break;
        // }

        // works on byte,short,int,char,string
        // does not work in type long,float,double,boolean.
           /*  reason for each -
            long -- we will never make that much cases
            float -- there is infinite numbers between 0 and 1
            double --   we will never make that much cases
            boolean -- only two cases are possible one for false another one for true.
           */

        // compulsory to use paranthesis {} other wise error will be-- insert SwitchBlock to complete SwitchStatement
        int number = 10;
        switch (number) {
            case 1:
                System.out.println("Samosha");
                break;
            case 2:
                System.out.println("Cachori");
                break;
            case 3:
                System.out.println("AlooBada");
                break;
            case 4:
                System.out.println("Lassi");
                break;
            case 5:
                System.out.println("Petties");
                break;

            default:
                System.out.println("we wake up");
                break; // no need of break in last case no matter it's default or not
        }
    }
}