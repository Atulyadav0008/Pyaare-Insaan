package Sorting;
import java.util.*;

public class InbuiltAdvance {
    public static void main(String[] args) {

        Integer[] Arr = {0, -2, 6, 45, -199, 897};
// yahan par primitive accept nahi hote hain , aapko unka object banana padega.
        Arrays.sort(Arr, Collections.reverseOrder());

        for (int x : Arr) {
            System.out.println(x);
        }
    }
}
