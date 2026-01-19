import java.util.Arrays;
class atul{
    public int[] runningSum(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main (String[] args){
        atul obj = new atul();
        int[] arr = {1,2,3,4,5};
        int[] last = obj.runningSum(arr);
        System.out.println(Arrays.toString(last));
    }
}