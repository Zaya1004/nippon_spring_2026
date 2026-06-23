public class Main {
    public static void main(String[] args) {
         Father myFather = new Father("Shagdarsuren. ", 60);
         myFather.printInfo();
         Son mySon = new Son("Sainbileg. ", 27);
         mySon.printInfo();
         Animal myAnimal = new Animal(true, "male", "dog");
         myAnimal.printInfo();
         Puppy myPuppy = new Puppy(true , "female", "Puppy");
         myPuppy.printInfo();
         Bird myBird = new Bird(false, "female", "Bird");
         myBird.printInfo();
         Shapes myShapes = new Shapes("red");
         myShapes.printInfo();
         Circle myCircle = new Circle("blue", 2.1);
         myCircle.printInfo();
         Rectangle myRectangle = new Rectangle("green", 2.1, 4.5);
         myRectangle.printInfo();
         Triangle01 myTriangle = new Triangle01("orange", 1.1, 4.3, 2.0);
         myTriangle.printInfo();
    }
}
