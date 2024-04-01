package basic;

import java.util.Scanner;

public class SIC {
    public static void main(String[] args) {
        int princple,rate,time;
        Scanner sc=new Scanner(System.in);
        princple=sc.nextInt();
        rate= sc.nextInt();
        time=sc.nextInt();

       int  simpleInterst = (princple*rate*time)/100;
        System.out.println(simpleInterst);
    }
}
