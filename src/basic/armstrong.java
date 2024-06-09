package basic;

public class armstrong {
    public static void main(String[] args) {

        System.out.println(armstrongNumber(153));
    }
    static String armstrongNumber(int n){

        int dup = n;
        int newNum = 0;

        while( n != 0)
        {
            int last = n% 10;
            n /= 10;

            last = last * last * last;

            newNum = newNum + last;

        }

        if (newNum != dup)
            return "No";

        return "Yes";
    }
}
