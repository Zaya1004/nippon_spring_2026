package nippon_spring_2026.month02.week08.day04;
class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void checkout() {
        if (!isAvailable) {
            System.out.println("\"" + title + "\"odoo zeelduulegdsen baina.");
        } else {
            isAvailable = false;
            System.out.println("\"" + title + "\" zeelduulegdlee");
        }
    }

    void returnBook() {
        isAvailable = false;
        System.out.println("\"" + title + "butsaagdlaa");
    }

    void showStatus() {
        System.out.println("\"" + title + "\" (" + author + ") - " + (isAvailable ? "Baigaa" : "Zeelduulegdsen"));
    }

}

class Library {
    static void showAllBooks(Book[] books) {
        System.out.println("\n=== Library ===");
        for (Book b : books)
            b.showStatus();
    }

    static int countAvailable(Book[] books) {
        int count = 0;
        for (Book b : books)
            if (b.isAvailable)
                count++;
        return count;
    }

    static Book findBook(Book[] books, String title) {
        for (Book b : books) {
            if (b.title.equals(title))
                return b;
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        Book[] library = {
                new Book("Java Суурь", "Батаа"),
                new Book("CSS Дизайн", "Сарнай"),
                new Book("Алгоритм", "Дорж"),
                new Book("Spring Boot", "Мөнх")
        };

        Library.showAllBooks(library);
        System.out.println("Imposiible: " + Library.countAvailable(library));

        library[0].checkout();
        library[2].checkout();
        library[0].checkout();

        Library.showAllBooks(library);

        Book found = Library.findBook(library, "CSS Дизайн");
        if (found != null) {
            found.checkout();
        }

        library[0].returnBook();
        Library.showAllBooks(library);
        System.out.println("Imposibble: " + Library.countAvailable(library));
    }
}
