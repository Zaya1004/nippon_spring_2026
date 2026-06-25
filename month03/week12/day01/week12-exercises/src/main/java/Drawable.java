public interface Drawable {
    void draw();
    default void printInfo(){
        System.out.println("Энэ зурагтай объект");
    }
} 
