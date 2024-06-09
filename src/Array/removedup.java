package Array;

public class removedup {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        removeElement(nums,val);
    }

    static void removeElement(int[] nums, int val) {
        int travasal = 0;
        int k = nums.length-1 ;

        while(k>travasal)
        {
            if(val == nums[k])
            {
                k--;
            }
            if(nums[travasal] == val)
            {


                    int temp = nums[k];
                    nums[k] = nums[travasal];
                    nums[travasal] = temp;

            }
            travasal++;
        }
        System.out.println(nums[k]);
        for(int i = 0 ;i< nums.length;i++)
        {
            System.out.print(nums[i]);
        }
    }
}
