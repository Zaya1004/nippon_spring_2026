public class CardPayment extends Payment{
    CardPayment(double amount){
        super(amount);
    }

    @Override
    void process(){
       System.out.println("Card: " + amount);
    }
}
