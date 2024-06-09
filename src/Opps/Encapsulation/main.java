package Opps.Encapsulation;

public class main {
    public static void main(String[] args) {
car c1=new car("R8","Audi",2010);
        car c2=new car("R8","Audi");
        System.out.println(c1.getModel());
        System.out.println(c1.getCompany()+" "+c1.getYear());
        c1.setModel("Q6");
        c1.setCompany("bmw");
        System.out.println(c1.getModel());
        System.out.println(c1.getCompany());
    }
}
