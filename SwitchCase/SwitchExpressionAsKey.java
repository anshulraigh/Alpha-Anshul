public class SwitchExpressionAsKey {
    // we can write case key as expression but the expression should be constant always.

    /* switch (5+5){ this will be valid 
        case 2+8:
                System.out.println("hii");
        break;
        default :
                System.out.println("default likhe h na");
    } 
    */
    /* switch (5+5 = 10){ error } 
       switch (5+5 <=10){ error } 
       switch (a+5 <=10){ No error , where a is variable which consist constant value }

    */

    public static void main(String[] args){
        int a = 10;
        final int b = 5;
        switch (a) {
            case 10:
                System.out.println("hii");
                // break; // here break is compulsory other wise switch will terminate in next break
            case 2:
                System.out.println("hii anshul");
                // break;
            case 3:
                System.out.println("hii pawan");
                break;
        
            case 4:
                System.out.println("hello ninja");
                break;
            case b: //case expressions must be constant expressions , to use variable as case make them final
                    //final keyword makes variable to constant.
                System.out.println("Jadoo");
                // break;
        
            default:
                break;
        }
    }
}
