package basic;

public class longestpalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaaaaabbbbbbb"));

    }
    static String longestPalindrome(String s) {
        int len = s.length();
        String longSubStr = "";
        for (int i = 0; i < len ; i++) {
            String subStr="";
            for (int j = i; j <len ; j++) {
                subStr += (s.charAt(j));
                if (isPal(subStr) && longSubStr.length() <subStr.length())
                {
                    longSubStr = subStr;
                }
            }
        }
    return longSubStr;
    }

    static  boolean isPal(String n)
    {
        int start=0;
        int end = n.length()-1;

        while (start<= end)
        {
            if(n.charAt(start)!=n.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
