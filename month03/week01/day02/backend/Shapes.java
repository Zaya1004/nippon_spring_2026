public class Shapes {
    private String color;
    

    public Shapes(String color){
        this.color = color;
       
    }

    
    public void printInfo(){
        System.out.println("Shape's color is " + color);
    }

    public String getColor(){
        return color;
    }
}

