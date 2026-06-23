public class Payment {
    double amount;
    Payment(double amount){
        this.amount = amount;
    }

    void process(){
        System.out.println("Tulbur: " + amount);
    }

    public static void main(String[] args) {
        Payment[] payments = {
            new Payment(20000),
            new CashPayment(13000),
            new CardPayment(7000)
        };

        for (Payment p : payments){
            p.process();
        }

        Payment p = new CashPayment(0);
        if (p instanceof Payment){
            CashPayment cp = (CashPayment) p;
            cp.process();
        }
    }
}
