package Hard.MethodOverriding;

public class FixedDepositAccount extends BankAccount {

    FixedDepositAccount(double principal, double years){
        super(principal, years);
        this.type = "Fixed Deposit";
    }
    @Override
    int calculateInterest(){
        return 8;
    }
}
