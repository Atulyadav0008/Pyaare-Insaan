package Sorting;

import java.util.Arrays;

public class Solution {
    public int[] concatenatedArray(int[] arr){
        int n = arr.length;
        int[] arr2 = new int[2*n];
        for(int i = 0; i<n; i++){
            arr2[i] = arr[i];
            arr2[i+n] = arr[i];
        }
        return arr2;
    }
    public int[] combineAndSorted(int[] arr1, int[] arr2){
       int n = arr1.length;
       int m = arr2.length;
       int[] finalArray = new int[n+m];
       for(int i = 0 ; i<n; i++){
           finalArray[i]=arr1[i];
       }
       for(int i = 0; i<m; i++){
           finalArray[i+n] = arr2[i];
       }
       Arrays.sort(finalArray);
       return finalArray;
    }
    public int[] reverseArray(int[] arr1){
        int n = arr1.length;
        int low = 0;
        int high = n-1;
//        for(int i = 0; i< n/2; i++){
        while (low<high){
            int temp = arr1[low];
            arr1[low] = arr1[high];
            arr1[high] = temp;

            low++;
            high--;
        }
        return arr1;
    }

public static finalvalueoperation(String[] operation)

    public static void main(String[] args){
        Solution obj =  new Solution();
        int[] arr1 = {8,9,5,4,18};
//        int[] arr2 = {11,6,9,0,3};
        int last[] = obj.reverseArray(arr1);
        System.out.println(Arrays.toString(last));

    }
}
