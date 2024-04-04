package devCohot;

public class twoSum {
    public static void main(String[] args) {
        int[] nums={3,3};
        int target = 6;

        int res[]=newSum(nums,target);
        System.out.println(res);
    }

     static int[] newSum(int[] nums, int target) {
         int[] res = new int[2];
         for(int i = 0; i<nums.length;i++)
         {
             for(int j = 1; j<nums.length;j++)
             {
                 if (nums[i]+nums[j]==target)
                 {
                     res[0]=i;
                     res[1]=j;
                     return res;
                 }
             }
         }
return null;
    }
}
