package basic;

public class laegesNumber {
    public static void main(String[] args) {
        int[] n =new int[] {99,102,43,65,19};

        int max =n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i]>max){
                max=n[i];
            }
        }
        System.out.println(max);
    }
}
