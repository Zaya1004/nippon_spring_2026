package nippon_spring_2026.month02.week07.day01;

public class Ex02 {
    static int double_(int n ){return n * 2; }
    static String shout(String s){ return s.toUpperCase() + "!"; }
    static boolean isBig(int n) {return n > 100; }
    static void stamp(String label, int value){
        System.out.println(label + "="+ value);
    }
    public static void main(String[] args) {
        System.out.println(double_(7));
        System.out.println(double_(double_(3)));
        System.out.println(shout("hello"));
        System.out.println(isBig(50));
        System.out.println(isBig(200));
        stamp("Dun", double_(45));
    }
}

