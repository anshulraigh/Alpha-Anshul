class ForEachLoop {
    /*
     * for-each loop
     * - it's used to traverse array or collection in java
     * - easier to use than simple for loop because we don't need to increment value
     * and use subscript notation
     * - it works on element basis not on index basis
     * - it returns element 1 by 1 in the defined variables
     */
    /*
     *  Sysntax -
     *  for(type variable: array){
     *      statement using variable.
     *     }
     */
    public static void main(String[] args) {
        int numbers[] = { 126, 304, 111, 101, 155, 300 };
        int maxSoFar = numbers[0];
        for (int num : numbers) {
            if (num > maxSoFar) {
                maxSoFar = num;
            }
        }
        System.out.print(maxSoFar);
    }
    /*
     * Limitations
     * 1) for-each loops are not appropriate when you want to modify the array
     *     eg. for(int num : marks){
     *            // only changes num , not the array element
     *            num = num*2;
     *          }
     * 
     * 2) for-each loops do not keep track of index so we cannot obtain array index
     *    using for-each loop
     *    for(int num : numbers){
     *        return ??? // do not know index of array.
     *    }
     * 
     * 3) for-each only forward over the array in single step 
     *    // cannot be converted to for-each loop
     *    for (int i=number.length-1; i>0; i--){
     *            System.out.print(number[i]);
     *        }
     * 4) for-each cannot process two decision making statements at once
     *     // cannot be converted to for-each loop
     *     for (int i=0; i<numbers.length; i--){
     *            if(number[i] == arr[i]){
     *               ...............
     *              }
     *        }
     */
}