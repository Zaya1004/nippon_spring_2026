public class Animal {
    private String race;
    private String gender;
    private boolean canRun;

    public Animal(boolean canRun, String gender, String race){
        this.canRun = canRun;
        this.race = race;
        this.gender = gender;
    }

    public void printInfo(){
        String runnable;
        if (canRun) {
            runnable = "runnable";
        } else {
            runnable = "not runnable";
        }
        System.out.println("the animal is race of " + race + ", and is " + gender + " animal. Animal is " + runnable);
    }

    public String getRace(){
        return race;
    }

    public String getGender(){
        return gender;
    }

}

