public class Main {
    public static void main(String[] args) {
        Shape shape01 = new Shape("Pink");
        System.out.println(shape01.color);

        Triangle01 triangle01 = new Triangle01("Blue", 1.0, 0.1);
        System.out.println(triangle01.area());
        System.out.println(triangle01.perimeter());

        AbstractShape square = new Square(4);
        square.area();
        square.perimeter();
        // Animals[] animals = {
        //       new Dogs(),
        //       new Cats(),
        //       new Parrot()
        // };

        // for (Animals a : animals) {
        //    a.showInfo();
        // }

        Animals dogs = new Dogs("buddy", 3);
        dogs.showInfo();
        Animals cats = new Cats("jerry", 2 );
        cats.showInfo();
        Animals parrot = new Parrot("jim", 1, false);
        parrot.showInfo();

        Weapons sword = new Sword("bot", 4, 5.0);
        sword.showStatus();
        Weapons bow = new Bow("Boo", 6, 8);
        bow.showStatus();
        Weapons staff = new Staff("Staff", 9, 3);
        staff.showStatus();
    }
}
