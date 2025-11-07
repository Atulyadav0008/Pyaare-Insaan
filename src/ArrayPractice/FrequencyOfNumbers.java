package ArrayPractice;

import java.util.*; // for Scanner and HashMap

public class FrequencyOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ✅ Step 1: Create a HashMap to store element-frequency pairs
        HashMap<Integer, Integer> freq = new HashMap<>();

        // ✅ Step 2: Count frequency using getOrDefault
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // ✅ Step 3: Print frequency of each number
        System.out.println("\nFrequency of each element:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
