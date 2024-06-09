package basic;

import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
    static void rotate(int[] nums, int k) {
        int last = nums.length - k;
        int[] arr = new int[last ];
        int i = 0;

        for(int j = 0; j < last  ; j ++)
        {

            arr[j] = nums[j];

        }

        for(;last < nums.length; last++)
        {
            nums[i] = nums[last];
            i++;
        }
        for(int j = 0; j < arr.length; j ++)
        {

            nums[i] = arr[j];
            i++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
