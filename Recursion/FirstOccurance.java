public class FirstOccurance {
    public static void main(String[] args) {
        /*
         * if key = 5 , and arr = {8,3,6,9,5,10,2,5,3} then return index 4
         * if key is not present return -1 as not found
         */
        int i = 0;
        int key = 5;
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccurance(arr, key, i));
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }
}
