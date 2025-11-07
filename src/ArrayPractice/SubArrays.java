package ArrayPractice;

public class SubArrays {
    public static void printSubArrays(int[] arr) {
        int ts = 0; // total subarrays
        int maxSum = Integer.MIN_VALUE; // largest subarray sum
        int minSum = Integer.MAX_VALUE; // smallest subarray sum

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;

                // Print and calculate sum of this subarray
                System.out.print("Subarray: ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }

                // Update min and max
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }

                ts++;
                System.out.println("→ sum = " + sum);
            }
            System.out.println();
        }

        // Final summary
        System.out.println("Total subarrays = " + ts);
        System.out.println("Largest subarray sum = " + maxSum);
        System.out.println("Smallest subarray sum = " + minSum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printSubArrays(arr);
    }
}
