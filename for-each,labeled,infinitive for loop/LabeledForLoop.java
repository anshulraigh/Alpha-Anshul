public class LabeledForLoop {
    /* Sysntax -
     * labelname: 
     * for(initialization;condition;incre/decre){
     *                 //code
     *                }
     */
    public static void main(String[] args) {
        aa:
        for (int i = 0; i < 3; i++) {
            bb:
            for (int j = 0; j < 3; j++) {
                if(i==2 && j==2){
                    continue aa;
                }else if(i==2 && j==3){
                    break bb;
                }
                System.out.println(i + " " +j);
            }
        }
    }
}
