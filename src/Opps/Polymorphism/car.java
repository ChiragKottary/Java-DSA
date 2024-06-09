package Opps.Polymorphism;

public class car extends vehicle{
    @Override
    void go() {
        System.out.println("car is moving");
        int formal1 = super.formal;
        System.out.println(formal1);
    }
    
}
