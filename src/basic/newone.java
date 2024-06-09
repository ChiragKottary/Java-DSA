package basic;

public class newone {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));

    }
    static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                count++;

            }
            if(nums[i] == 0)
            {
                count = 0;

            }
            if( max < count)
                max=count;
        }
        return count;
    }
}
