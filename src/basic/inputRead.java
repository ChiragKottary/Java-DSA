package basic;

import java.util.Scanner;

public class inputRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        String s= sc.next(); //reads a string until a white space
//        String sw=sc.nextLine();

        //to acess first char there is no such function
        //so we use CharAt fun eg:
        char singleChar= sc.next().charAt(0);
        System.out.println(singleChar);

    }
}
