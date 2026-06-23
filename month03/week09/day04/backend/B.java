public class B extends A {
        int y;
        B(int x, int y){
            super(x);
            this.y = y;
            System.out.print("B(" + y + ")");
        }

        @Override
        void show(){
            super.show();
            System.out.print("B: " + y);
        }
}
