package Medium.MethodOverriding;

/*
Medium Problem – Vehicle Speed
Problem:
Create a base class Vehicle with a method run() that prints "Vehicle is running."
Create subclasses:

Car overrides run() to print "Car is running at 80km/h."
Bike overrides run() to print "Bike is running at 50km/h."
Use a method testDrive(Vehicle v) which calls v.run()
Pass different types of vehicles to demonstrate polymorphism.

Concepts Practiced:
Overriding with runtime polymorphism
Passing subclass objects to methods expecting superclass
 */
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();


        vehicle.testDrive(vehicle);

        car.testDrive(car);

        bike.testDrive(bike);
    }
}
