package ArrayPractice;

public class BinarySearch {
    public void binarySearchBuilder(int[] arr, int data) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == data) {
                System.out.println("Element found: " + arr[mid]);
                return;
            } else if (arr[mid] < data) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        new BinarySearch().binarySearchBuilder(arr, 10);
    }
}

