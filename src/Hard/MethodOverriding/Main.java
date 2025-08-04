package Hard.MethodOverriding;

public class Main {
    public static void main(String[] args) {

        BankAccount[] users = {new BankAccount(100000,1.5),
                               new SavingsAccount(100000,1.5),
                               new FixedDepositAccount(100000,1.5)};

        for(BankAccount user: users){
            user.displayInterest();
            System.out.println();
        }
    }
}
