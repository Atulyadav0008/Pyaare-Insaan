package ArrayPractice;

public class MaxSubArraySum {

//    public static void Possible_pairs(int[] arr){
//        for(int i = 0; i< arr.length; i++){
//            for(int j = i+1; j< arr.length; j++){
//                System.out.println("("+arr[i]+","+arr[j]+")");
//            }
//            System.out.println();
//        }
//    }

//    public static void PrintSubArrays(int[] arr){
//     for(int i = 0; i< arr.length; i++){
//         int start = i;
//         for(int j = i; j< arr.length; j++){
//             int end = j;
//             for(int k = start; k<= end; k++ ){
//                 System.out.print(arr[k]+ " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//        }

    // Implemention of Cadanes Algorithm.

    public static void Cadanes(int[] arr){
        int Max_sum = Integer.MIN_VALUE;
        int Current_sum = 0;

        for(int i = 0; i< arr.length; i++){
            Current_sum = Current_sum + arr[i];
            if(Current_sum < 0) {
                Current_sum = 0;
            }
            Max_sum = Math.max(Current_sum,Max_sum);
        }
        System.out.println("Max_sum is : " + Max_sum);
    }





    static void main(String[] args) {
        int[] arr = {1,3,5,7,9,19};
        Cadanes(arr);
    }
}
