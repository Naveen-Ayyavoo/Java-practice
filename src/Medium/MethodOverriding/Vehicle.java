package Medium.MethodOverriding;

public class Vehicle {
    void run(){
        System.out.println("Vehicle is running.");
    }

    void testDrive(Vehicle type){
        type.run();
    }
}
