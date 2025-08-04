package Medium.MethodOverriding;

public class Bike extends Vehicle{
    @Override
    void run(){
        System.out.println("Bike is running at 50km/h.");
    }
}
