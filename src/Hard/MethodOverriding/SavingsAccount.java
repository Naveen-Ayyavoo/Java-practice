package Hard.MethodOverriding;

public class SavingsAccount extends BankAccount {

    SavingsAccount(double principal, double years){
        super(principal, years);
        this.type = "Savings";
    }
    @Override
    int calculateInterest(){
        return 6;
    }
}
