package nippon_spring_2026.month01.week05.day01;

public class Code_zasakh {
    public static void main(String[] args) {
        int score = 85;
        if (score == 100) {
            System.out.println("Tugs onoo!");
        }
        int age = 25;
        if (age > 18 && age < 60) {
            System.out.println("Ajilchin angi");
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Neg");
                break;
            case 2:
                System.out.println("Hoyr");
                break;
            case 3:
                System.out.println("Gurav");
            default:
                System.out.println("Busad");
        }
        int x = 50;
        if (x > 10) {
            System.out.println("10s baga");
        } else if (x > 30) {
            System.out.println("30s ikh");
        } else {
            System.out.println("Too oruulna.");
        }
    }
}
