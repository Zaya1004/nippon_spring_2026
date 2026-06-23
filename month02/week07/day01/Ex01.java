package nippon_spring_2026.month02.week07.day01;
public class Ex01 {
    static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args) {
        greet("Zaya");
        System.out.println(max(4, 6));
        System.out.println(isEven(9));
        System.out.println(circleArea(3.4));
    }
    static int max(int a, int b){
        if (a > b) return a;
        return b;
    }
    static boolean isEven(int n){
        return n % 2 == 0;
    }
    static double circleArea(double r){
        return Math.PI * r * r;
    }
}
