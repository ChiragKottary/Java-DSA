package devCohot;

public class chefString {
    public static void main(String[] args) {
        System.out.println(Solution("aebcdefghij"));

    }
    static String Solution(String s)
    {
        for(int i =0;i< s.length()-2;i++)
        {
            if(isVowel(s.charAt(i))&&isVowel(s.charAt(i+1))&& isVowel(s.charAt(i+2)))
            {
                return "HAppy";
            }

        }
        return "sad";
    }
    static boolean isVowel(char c){
        if( c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;
        }
        return false;
    }
}

