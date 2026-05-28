public class C extends B{
    int z;
    C(int x, int y, int z){
        super(x, y);
        this.z = z;
        System.out.print("C(" + z + ")");
    }

    @Override
    void show(){
        super.show();
        System.out.print("C(" + x + ", " + y + ", " + z + ")");
    }
}
