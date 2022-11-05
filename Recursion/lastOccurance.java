public class lastOccurance {
    public static void main(String[] args) {
        /*
         * if key = 5 , and arr = {8,3,6,9,5,10,2,5,3} then return index 7
         * if key is not present return -1 as not found
         */
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.print(last_Occurance(arr,5,0));
    }
    public static int last_Occurance(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = last_Occurance(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
}
