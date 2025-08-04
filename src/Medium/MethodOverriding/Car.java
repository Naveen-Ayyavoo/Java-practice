package Medium.MethodOverriding;

public class Car extends Vehicle {

    @Override
    void run(){
        System.out.println("Car is running at 80km/h.");
    }
}
