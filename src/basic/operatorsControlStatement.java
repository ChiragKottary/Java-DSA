package basic;

public class operatorsControlStatement {
    public static void main(String[] args) {
        operator();
        statement(2,2);
    }

     static void statement(int a , int b) {

        if (a>b)
        {
            System.out.println("a is greater");
        } else if (a<b) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("both are equal");
        }
     }

    static void operator() {

        // + - / * %
         // > < >= <= ==
         // Assignment vs Equality
         //    =       vs  ==

    }
}
