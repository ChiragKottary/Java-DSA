package devCohot;

public class goodPair {
    public static void main(String[] args) {
        int[] nums = new int[]{ 1,2,3,1,1,3 };
        System.out.println(f(nums));
    }
    static int f(int[] nums)
    {
        int count=0;
        for(int x=0;x<nums.length;x++)
        {
            for (int i = 0; i <nums.length ; i++) {
                if(nums[i]==nums[x]&& i<x){
                    count++;
                }

            }
        }
        return count;
    }
}
