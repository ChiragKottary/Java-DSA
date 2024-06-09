package Opps.Polymorphism;

public class main {
    public static void main(String[] args) {
car c1=new car();
boat boat=new boat();
bike b1=new bike();

        vehicle[] race={c1,b1,boat};
        for (vehicle x:race) {
            x.go();
        }
    }
}
