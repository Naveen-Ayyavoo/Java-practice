package Medium.Inheritance;

public class Manager extends Employee{

    int teamSize;
    Manager(String name, double salary, int teamSize){
        super(name,salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Team Size: " + this.teamSize);
    }
}
