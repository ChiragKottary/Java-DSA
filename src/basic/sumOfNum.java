package basic;

import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int res=0;
        for(int i =1 ;i<=num;i++)
        {
            res+=i;
        }
        System.out.println(res);
    }
}
