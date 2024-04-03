package basic;

public class evenorodd {
    public static void main(String[] args) {
        oddeven(8);
    }

     static void oddeven(int i) {
//         if (i%2==0) {
//             System.out.println("even");
//         }else {
//             System.out.println("odd");
//         }

         System.out.println(i%2==0?"even":"odd");// ternary operator
    }
}
