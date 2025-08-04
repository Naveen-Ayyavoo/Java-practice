package Hard.MethodOverriding;

public class BankAccount {

    double principal;
    double years;
    String type;

    BankAccount(double principal, double years){
        this.principal = principal;
        this.years = years;
        this.type = "Normal";
    }

    int calculateInterest(){
        return 4;
    }

    int simpleInterest(){
        return (int) (this.principal * this.years * this.calculateInterest() / 100);
    }

    void displayInterest(){
        System.out.println("Account Type: " + this.type);
        System.out.println("Interest Rate: " + this.calculateInterest() + "%");
        System.out.println("Simple Interest: " + this.simpleInterest());
    }
}
