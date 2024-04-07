package devCohot;

public class highestPeak {
    public static void main(String[] args) {
        int[] gain=new int[]{52,-91,72};
        System.out.println(largestAltitude(gain));

    }
         static int largestAltitude(int[] gain) {
             int[] prefix_sum = new int[gain.length];
             prefix_sum[0] = gain[0];
             int max=gain[0];
             for(int i=1; i<gain.length; i++) {
                 prefix_sum[i] = prefix_sum[i-1] + gain[i];
                 if(max<prefix_sum[i])
                 {
                     max=prefix_sum[i];
                 }
             }
             return max;
        }

}
