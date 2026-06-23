package nippon_spring_2026.month03.week10.day04.backend.src.test.java.com.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    void testSavingsDeposit(){
      SavingsAccount acc = new SavingsAccount("Bataa ", 100_000, 50_000);
      acc.deposit(30_000);
      assertEquals(130_000, acc.getBalance(), 0.001);
    }

    @Test
    void testSavingWithdraw(){
        SavingsAccount acc = new SavingsAccount("Bataa ", 100_000, 50_000);
        acc.withdraw(40_000);
        assertEquals(60_000, acc.getBalance(), 0.001);
    }

    @Test
    void testSavingsBelowMinimum(){
        SavingsAccount acc = new SavingsAccount("Bataa ", 100_000, 50_000);
        assertThrows(IllegalStateException.class, () -> acc.withdraw(60_000));
    }

    @Test
    void testSavingNoMonthlyFee(){
        SavingsAccount acc = new SavingsAccount("Bataa ", 100_000, 50_000);
        assertEquals(0, acc.monthlyFee(), 0.001);
    }

    @Test
    void testCheckingWithdrawFee(){
        CheckingAccount acc = new CheckingAccount("Sarnai", 200_000, 3, 4);
        acc.withdraw(10_000);
        assertEquals(179_500, acc.getBalance());
    }

    @Test
    void testCheckingWithdrawWithFee() {
        CheckingAccount acc = new CheckingAccount("Sarnai", 200_000, 1, 3);
        acc.withdraw(10_000);
        acc.withdraw(10_000);
        assertEquals(179_500, acc.getBalance());
    }

    @Test
    void testApplyMonthlyFee(){
        CheckingAccount acc = new CheckingAccount("Sarnai", 200_000, 3, 1);
        acc.applyMonthlyFee();
        assertEquals(198_000, acc.getBalance(), 0.001);
    }

    @Test
     void testPolymorphicDeposit(){
        BankAccount[] accounts = {
                new SavingsAccount("A", 100_000, 50_000),
                new CheckingAccount("B", 100_000, 3, 1 )
        };
        for (BankAccount acc : accounts){
            acc.deposit(10_000);
            assertEquals(110_000, acc.getBalance());
        }
    }
}
