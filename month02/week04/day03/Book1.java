public class Book1 {
   class Book{
     String title;
    String author;
    int pages;
    double price;
    Book (String title, String author, int pages, double price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    boolean isLonger(Book other){
        return this.pages > other.pages;
    }

    boolean isCheaper(Book other){
        return this.price < other.price;
    }

    void showInfo(){
        System.out.println("\"" + title + "\"-" + author + "(" + pages + "huudas," + price + "$)");
    }
   }
   public static void main(String[] args) {
        Book b1 = new Book("Java suuri", "Bataa", 320, 25000);
        Book b2 = new Book("CSS gariin avlaga", "Sarnai", 180, 18000);
        Book b3 = new Book("Algoritm", "Dorj", 450, 32000);

        b1.showInfo();
        b2.showInfo();
        b3.showInfo();

        System.out.println("\b1 b2-oos urt uu? " + b1.isLonger(b2));
        System.out.println("b2 b3-aas hymd uu? " + b2.isCheaper(b3));

        Book longest = b1;
        if (b2.isLonger(longest)) longest = b2;
        if (b3.isLonger(longest)) longest = b3;
        System.out.println("hamgiin urt nom: " + longest.title + "(" + longest.pages + "huudas");
   }
}

