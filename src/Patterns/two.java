package Patterns;

public class two {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        for (int row = 0; row < n; row++) {
            for (int i = n-1; i > 0 ; i--) {
                System.out.print(" ");
            }
            for (int j = n; j >=0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
