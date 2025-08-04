package Medium.Inheritance;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {new Employee("Naveen",10000),
                                new Manager("Harish",200000,3),
                                new Developer("Kamal",250000,"Java")};

        for(Employee employee:employees){
            employee.displayInfo();
            System.out.println();
        }
    }
}
