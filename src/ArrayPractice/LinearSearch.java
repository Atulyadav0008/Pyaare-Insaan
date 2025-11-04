package ArrayPractice;

public class LinearSearch {
    public static int searchElement(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int data = 15;
        int[] arr = {17, 19, 18, 15, 11, 10, 9, 0};

        int index = searchElement(arr, data);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
