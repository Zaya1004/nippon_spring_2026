package nippon_spring_2026.month02.week02.day02.backend;

public class Array01 {
    public static void main(String[] args) {
        // 100 variable
        int a = 6;
        double b = 5.6;
        String name = "Zaya";
        char letter = 'S';
        boolean hudal = false;

        // array turultei variable
        int[] buhelToonuud = {1, 10, 6, 7,};

        //boolean
        boolean[] hudluud = {false, false};

        //String
        String[] names = {"Zaya", "Nora", "Saka"};

        //double
        double[] butarhainuud = {12.99, 0.9};

        //char
        char[] usegnuud = {'a', 'b'};
        System.out.println(names);

        //index gedeg zuil buyu element songoh
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(butarhainuud[1]);
        butarhainuud[1]=4.50;
        System.out.println(butarhainuud[1]);

        System.out.println(usegnuud.length);

        double [] mynumbers = {0.3, 12.5, 5.6, 9.87, 0.6, 3.4, 0.2, 10.4, 4.19, 4.20};
        mynumbers[4] = mynumbers[4]+1;
        mynumbers[0] = 0;
        mynumbers[mynumbers.length - 1] = mynumbers[mynumbers.length - 1] + 8;
        for(int i = 0; i < mynumbers.length; i++){
            System.out.println(mynumbers[i]);
        }
    }
}
