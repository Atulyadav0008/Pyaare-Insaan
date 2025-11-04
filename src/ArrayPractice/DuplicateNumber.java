package ArrayPractice;

public class DuplicateNumber {

    public static void checkDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Number is duplicate: " + arr[i]);
                    return; // stop after finding first duplicate
                }
            }
        }
        System.out.println("No number has duplicate");
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 4, 5, 1, 8};
        checkDuplicate(arr);
    }
}
