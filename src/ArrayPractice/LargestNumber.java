package ArrayPractice;

public class LargestNumber {
    public static int largeNumber(int arr[]) {
       int largest = Integer.MIN_VALUE; // it is used to use a negative infinity.
        for(int i = 0; i< arr.length; i++){
            if(largest < arr[i]){
               largest = arr[i];
            }
        }
        return largest;
    }

    public static int SmallestNumber(int arr[]) {
        int minimum = Integer.MAX_VALUE; // we put positive infinity in this, its only logical thing.
//        for(int i = 0; i< arr.length; i++){
//            if(minimum > arr[i]){
//                minimum = arr[i];
//            }
        for (int x : arr) {
            if (minimum > x) {
                minimum = x;
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,6,3,5,-1};
        int ans = largeNumber(arr); // it is used for largest number in array.
        int ans2 = SmallestNumber(arr); // it is used for minimum number in array.
        System.out.println("largest number is: " + ans + " Smallest number is : " + ans2);
    }
}
