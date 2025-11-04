package DSA.ArrayDataStructure;
import java.util.Arrays;

public class ArraybyFunction {
    public static void main(String[] args) {
        int[] nums = {100, 101, 102, 103};
        System.out.println(Arrays.toString(nums));

        int largest = change(nums); // store the returned largest
        System.out.println("Largest element: " + largest);
    }

    // static because we are calling it from static main()
    public static int change(int[] nums) {
        int lowest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < lowest) {
                lowest = nums[i];
            }
        }
        return lowest;
    }
}
