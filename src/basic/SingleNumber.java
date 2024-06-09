package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
int[] n = new int[]{4,1,2,1,2};

        System.out.println(singleNumber(n));
    }
    static int singleNumber(int[] nums) {
        List<Integer> list= new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i]))
            {
                int n = nums[i];
                list.remove(n);

            }
            else
                list.add(nums[i]);

        }
return list.get(0);
    }
}
