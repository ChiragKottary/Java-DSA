package basic;

public class divs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int ans = sumFourDivisors(nums);
        System.out.println(ans);
    }

    static int sumFourDivisors(int[] nums) {
        int div = 1;
        int ans = 0;
        int count = 0;
        int finans = 0;

        for (int i = 0; i < nums.length; i++) {
            while ( nums[i] >= div*div) {
                if (nums[i] % div == 0 && count<=4) {
                    ans = ans + nums[i]/div + div;
                    count+=2;
                }
                div++;
            }

            div = 1;
            if (count == 4 && finans==finans){
                finans+=ans;
            }
            if(count == 4 && finans<= ans)
            {
                finans=ans;
            }
            count =0;
            ans = 0;
        }
        return finans;
    }
}

