package basic;

import java.util.Arrays;

public class rmvzero {
    public static void main(String[] args) {


                moveZeroes(new int[]{0,1,0,3,12});
    }
    static void moveZeroes(int[] n) {
        int len=0;

        if(n.length==2)
        {
            len = 0;
        }
        else
            len =n.length-3;


        for (int i = 0; i<=len;i++)
        {
            if (n[i]==0 &&n[i+1]==0){
                int temp = n[i];
                n[i]=n[i+2];
                n[i+2]=temp;
            }
            if (n[i]==0){
                int temp = n[i];
                n[i]=n[i+1];
                n[i+1]=temp;
            }
        }

//        while()
//        {
//            if(n[start] == 0 && n[start]!=n[end])
//            {
//                int temp = n[start];
//                n[start] = n[end];
//                n[end] = temp;
//                end++;
//            }
//
//            start++;
//        }
        System.out.println(Arrays.toString(n));
    }
}
