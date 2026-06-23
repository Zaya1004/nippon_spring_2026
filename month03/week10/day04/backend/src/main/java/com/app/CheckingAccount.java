package nippon_spring_2026.month03.week10.day04.backend.src.main.java.com.app;

public class CheckingAccount extends BankAccount{
    private int freeTransactions;
    private int transaction;
    CheckingAccount(String owner, double initialBalance, int freeTransactions, int transaction){
        super(owner, initialBalance);
        this.freeTransactions = freeTransactions;
        this.transaction = transaction;
    }

    @Override
    void withdraw(double amount){
        if (amount > balance) throw new IllegalStateException("Insufficient funds");
        transaction ++ ;
        if (transaction > freeTransactions) {
            balance -= 500;
        }
    }

    @Override
    double monthlyFee(){
        return 2000;
    }
}
