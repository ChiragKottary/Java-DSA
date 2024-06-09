package Array;

public class longpal {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aacabdkacaa"));

    }
    public static Boolean isPal(String s) {
        int i = 0;
        int j = s.length()-1;

        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        int n = s.length();
        String longPalStr = "";
        for(int i = 0 ;i < n; i++)
        {
            String substr = "";
            for(int j = i; j < n;j++)
            {
                substr += (s.charAt(j)+"");
                if(isPal(substr) && substr.length() > longPalStr.length()){
                    longPalStr = substr;
                }
            }
        }
        return longPalStr;
    }
}
