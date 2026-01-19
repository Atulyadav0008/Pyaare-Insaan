package Sorting;

public class CountingSort {
    public static void Counting(int arr[]){
        int largest = Integer.MIN_VALUE; // yahan initialise kiya h neg infinity ko as min val.
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(arr[i],largest); //Max find kiya hai yahan par.
        }

        //yahan ise arr pe kaam karke banaya tha.
        int Count[] = new int[largest+1]; // yahan ye dekha ki kon sa element kitni baar aaya.
        for(int i = 0; i < arr.length; i++){
            Count[arr[i]]++; // yahan par uski appearnce ko badhaya.
        }


        // Sorting karne ka logic
        int j = 0;
        for(int i = 0; i< Count.length; i++){
            while(Count[i] > 0){
                arr[j]=i;
                j++;
                Count[i]--;
            }
        }
    }

    public static void print(int Count[]){
        for(int i = 0; i< Count.length; i++){
            System.out.println(Count[i]);
        }
    }
    public static void main(String[] args){
        int arr[] = {1,67,89,89,2,9,0,12,1};
        Counting(arr);
        print(arr); //yahan pe maine Count array ko daal ke dekha but bo ni chali.
    }
}
