public class Bird extends Animal {
    public Bird( boolean canRun, String gender, String race) {
        super(canRun, gender, race);

    }


    public boolean getFly(){
        return true;
    }

    @Override
    public void printInfo() {
   System.out.println("Bird has gender of " + getGender() + "." + getRace() + getFly());
}
}
