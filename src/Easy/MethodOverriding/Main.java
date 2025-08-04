package Easy.MethodOverriding;

/*
Easy Problem – Animal Inheritance
Problem:
Create a base class called Animal with a method makeSound().
Then, create two derived classes: Dog and Cat. Override the makeSound() method in both to print "Bark" and "Meow" respectively.
Write a main method to demonstrate polymorphism.

Key Concepts Practiced:
Basic inheritance
Method overriding
Polymorphism

 */
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
