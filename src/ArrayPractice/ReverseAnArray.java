package ArrayPractice;

public class ReverseAnArray {
    public static void Rev_Array(int arr[]){
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Best way to do it, with minimum time and Space complexity.
    public static void SmartWayReversing(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        SmartWayReversing(arr);
    }
}
