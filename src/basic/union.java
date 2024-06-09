package basic;

import java.util.ArrayList;
import java.util.List;

public class union {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        List<Integer> list = new ArrayList<Integer>();


        for(int i = 0; i< Math.max(n,m);i++)
        {
            if (list.contains(arr1[i]))
            {
                continue;
            }
            else
            {
                list.add(arr1[i]);
            }
            if (list.contains(arr2[i]))
            {
                continue;
            }
            else
            {
                list.add(arr2[i]);
            }

        }
        return (ArrayList<Integer>) list;
    }
}
