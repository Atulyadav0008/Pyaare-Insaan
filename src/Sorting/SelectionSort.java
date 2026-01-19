// File: Sorting/SelectionSort.java
package Sorting;

/**
 * Standard Selection Sort implementation.
 */
public class SelectionSort {

    /** Sorts array in ascending order. */
    public static void SelectionAlgo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {  // why: iterate remaining elements
                if (arr[j] < arr[minpos]) {             // why: select smallest value
                    minpos = j;
                }
            }
            int swap = arr[minpos];                     // why: swap minimum into position i
            arr[minpos] = arr[i];
            arr[i] = swap;
        }
    }

    /** Prints array elements. */
    public static void printSelection(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 45, 87, 0, 43, 67, -2, 89};
        SelectionAlgo(arr);
        printSelection(arr);
    }
}
