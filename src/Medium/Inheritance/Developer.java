package Medium.Inheritance;

public class Developer extends Employee{

    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage){
        super(name,salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Language: " + this.programmingLanguage);
    }
}
