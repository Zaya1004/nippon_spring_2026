public class A {
    int x;
    A(int x ){
        this.x = x; System.out.print("A(" + x + ")");
    }    
    void show(){
        System.out.print("A: " + x);
    }

    public static void main(String[] args) {
        A[] as = {
            new B(9,7),
            new C(9,7,6)
        }; for (A a : as){
            a.show();
        }
    }
}
