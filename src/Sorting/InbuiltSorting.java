package Sorting;
import java.util.Arrays;
public class InbuiltSorting {
    public static void main(String[] args) {
        int arr[] = {1, 89, 5, 54, 0};
//        Arrays.sort(arr); // this is used to sort arrays in ascending order.
        Arrays.sort(arr,0,3); // it is used to sort in limit only.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
