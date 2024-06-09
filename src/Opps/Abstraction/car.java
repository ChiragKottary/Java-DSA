package Opps.Abstraction;

public class car extends vehical{
    @Override
    void go() {
        speed=10;
        System.out.println("car moves fast...");
        System.out.println(speed);
    }
}
