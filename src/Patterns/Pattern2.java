package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for(int i = n - 2; i >= 0; i--){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
