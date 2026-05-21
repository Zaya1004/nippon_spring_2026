package month02.week04.day03;

public class Product {
    String name;
    double price;
    int stock;

   Product(String name, double price, int stock){
    this.name = name;
    this.price = price;
    this.stock = stock;
   }

   void sell(int qty){
    if (qty > stock){
        System.out.println(name + ": Nuuts hureltsehgui! Baigaa: " + stock);
    } else {
        stock -= qty;
        System.out.println(name + ": " + qty + "zaragdlaa. Uldegdel: " + stock);
    }
}

void restock(int qty){
    stock += qty;
    System.out.println(name + ": " + qty + "nemegdlee. Niit: " +stock);
}

double totalValue(){
    return price * stock;
}

boolean isExp(Product other){
    return this.price > other.price;
}

void showInfo(){
    System.out.printf("%s: %.0f$, Nuuts: %d, Niit une: %.0f$%n",
            name, price, stock, totalValue());
}
public static void main(String[] args) {
     Product p1 = new Product("Дэвтэр", 2500, 100);
        Product p2 = new Product("Харандаа", 800, 50);
        Product p3 = new Product("Ном", 15000, 20);

        p1.showInfo();
        p1.sell(30);
        p1.sell(80);  // хүрэлцэхгүй
        p2.restock(100);
        p3.showInfo();

        System.out.println("\np1 p2-оос үнэтэй үү? " + p1.isExp(p2));
        System.out.println("p3 p1-ээс үнэтэй үү? " + p3.isExp(p1));

        // Хамгийн үнэ өндөртэй
        Product expensive = p1;
        if (p2.isExp(expensive)) expensive = p2;
        if (p3.isExp(expensive)) expensive = p3;
        System.out.println("Хамгийн үнэтэй: " + expensive.name);
}
}
