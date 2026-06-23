public class CashPayment extends Payment{
    CashPayment(double amount){
        super(amount);
    }
    
    @Override
    void process(){
        System.out.println("Cash: " + amount);
    }
}
