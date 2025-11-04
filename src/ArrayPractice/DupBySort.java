package ArrayPractice;

import java.util.Arrays;

public class DupBySort {
    public static void sortAndduplicate(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                System.out.println("duplicate is found : "+ arr[i]);
                return;
            }
        }
        System.out.println("Element is not found!!");
    }

    public static void main(String[] args) {
        int arr[] = { 1,3,-1,0,64,2,2,8908,65};
        sortAndduplicate(arr);
    }
}
