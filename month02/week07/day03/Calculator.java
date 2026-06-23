package nippon_spring_2026.month02.week07.day03;

public class Calculator {
    static int calculate(int a, int b, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Wrong op");
                break;
        }
        return result;
    }

    static double calculate(double a, double b, char op) {
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Wrong op");
                break;
        }
        return result;
    }

    static int calculate(int a, int b) {
        return a + b;
    }

    static int calculate(int a, char op) {
        int result = 0;
        switch (op) {
            case '^':
                result = a * a;
                break;
            case 'r':
                result = 1 / a;
                break;
            default:
                System.out.println("Wrong op");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 3, '+')); // 5
        System.out.println(calculate(5, 4, '-')); // 1
        System.out.println(calculate(1, 2, '*')); // 2
        System.out.println(calculate(9, 3, '/')); // 3
        System.out.println(calculate(3, 9, '<')); // Wrong
        System.out.println(calculate(3.14, 3.14, '+'));
        System.out.println(calculate(4.5, 2.5, '-'));
        System.out.println(calculate(0.1, 8.4, '*'));
        System.out.println(calculate(9.5, 3.14, '/'));
        System.out.println(calculate(10, 3));
        System.out.println(calculate(4, '^'));
        System.out.println(calculate(9, 'r'));
    }
}
