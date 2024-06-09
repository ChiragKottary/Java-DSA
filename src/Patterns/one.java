package Patterns;

public class one {
    public static void main(String[] args) {
pat5(10);
    }
    static void pat(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pat3(int n){
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n-i+1 ; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat4(int n){
        for (int i = 0; i < n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int space = 0; space <= n-i; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pat5(int n){
        for (int i = 0; i < n; i++) {
            if (i%2!=0){
                continue;
            }else {
            for (int space = 0; space < n-i+1 ; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }}






}
