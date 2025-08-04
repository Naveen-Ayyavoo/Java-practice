package Medium.Inheritance;

public class Employee {

    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}
