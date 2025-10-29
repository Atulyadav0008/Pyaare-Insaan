package DSA;

import java.sql.SQLOutput;
import java.util.Scanner;

// String[] here it is declared, Student is an object and
// memory will allocate to that object.
//Heap object are not continuous, array objects lies in heap.so they are not continuous,
// internally in java .it depends on JVM.
//Primitive stored in stack , others in heap.
public class Arrays {
    public static void main(String[] args) {
    int arr[] = {67,68,69,70,71,72};
    arr[0]=100;
        System.out.println(arr[2]);
    }
}

