package ArrayPractice;

public class CadanesAlgorithm {

    // Implemention of Cadanes for simple Arrays.
    public static void CadnesSimple(int[] arr) {
        int Max_sum = Integer.MIN_VALUE;
        int Current_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            Current_sum = Current_sum + arr[i];
            if (Current_sum < 0) {
                Current_sum = 0;
            }
            Max_sum = Math.max(Current_sum, Max_sum);
        }
        System.out.println("Max_sum is : " + Max_sum);
    }

    //Cadanes modified
    public static void CadnesModified(int[] arr){
        int Max_sum = arr[0];
        int Curr_sum = arr[0];

        for(int i = 1; i< arr.length; i++){
            Curr_sum = Math.max(arr[i],Curr_sum + arr[i]);
            Max_sum = Math.max(Curr_sum,Max_sum);
        }
        System.out.println("Max_sum is : " + Max_sum);
    }











    public static void main(String[] args) {
        int[] arr = {-2, -4, -5, -56,90,780,6543};
        CadnesSimple(arr);
        CadnesModified(arr);
    }
}