package Array;

public class SingleNum {
    public static void main(String[] args) {
       int res= singleNumber(new  int[]{1,2,3,1,3});
        System.out.println(res);
    }
        static int singleNumber(int[] nums) {
            int XOR=0;
            for(int i=0;i<nums.length;i++){
                XOR=XOR^nums[i];
            }
            return XOR;
        }
    }

