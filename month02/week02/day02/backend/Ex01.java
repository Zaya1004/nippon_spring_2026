package nippon_spring_2026.month02.week02.day02.backend;
public class Ex01 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < mass.length; i++){
            System.out.println(mass[i]);
        }
        String[] friuts = {"Apple", "Banana", "Cherry", "Date"};
        for(String friut : friuts) {
            System.out.println(friut);
        }
        

        int[] num = {23, 45, 12, 67, 34};
        int sum = 0;
        for(int s : num ){
            sum +=s;
        }
        System.out.println("Sum: "+ sum);
    }
}
