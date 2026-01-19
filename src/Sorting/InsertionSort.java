package Sorting;

public class InsertionSort {

    // function for insertion sort.
    public static void insertion(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i]; // curr element wahi hoga jo iteration chal rhi hogi'
            int prev = i-1; // prev ko hamesha ek kam rakhenge , kyunki for 1 se shuru hua hai. tb prev 0 hoga.

            // Jagah dhundh rhe hai ki kahan pe isert ho sakta hai.
            while(prev >= 0 && arr[prev] > curr){
                arr[prev +1 ]= arr[prev];
                prev--;
            }

            //Insertion kar rhe hai, yahan +1 isliye kyunki hamne prev ko -- kiya tha na.
            arr[prev+1]= curr;
        }
    }
public static void print(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    System.out.println();
}
    public static void main(String[] args){
        int arr[] = {1,3,7,0,80,64};
        insertion(arr);
        print(arr);
    }
}
