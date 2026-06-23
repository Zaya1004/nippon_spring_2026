public class Puppy extends Animal {
   
    public Puppy( boolean canRun, String gender, String race) {
        super(canRun, gender, race);
    }

    @Override
    public void printInfo() {
        System.out.println("Puppy has gender of " + getGender());
    }

}
