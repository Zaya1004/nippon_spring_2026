public class Concat {
    static String stringConcat (String name){
        return "Hello " + name;
    }
    public static void main(String[] args) {
        System.out.println(stringConcat("Zaya"));
        System.out.println("Nora");
        System.out.println("Saka");
        aboutMe();
        aboutMe();
        System.out.println(repeat("*", 5));
        System.out.println(repeat("+", 15));
        System.out.println(isEven(2));
        System.out.println(isEven(3));
    }
    static void aboutMe(){
        System.out.println("Hi, my name is Zaya");
        System.out.println("I'm 21 years old");
    }
    static String repeat(String s, int times){
        String result = "";
        for (int i = 0; i < times; i++){
            result +=s;
        }
        return result;
    }
    // boolean - true/false butsaana
    static boolean isEven(int n){
        return n % 2 ==0;
    }
}
