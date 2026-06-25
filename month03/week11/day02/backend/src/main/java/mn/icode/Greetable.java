package mn.icode;

interface  Greetable{
	String greet();
	default String greetLoud() {
		return greet().toUpperCase();
	}
	
	

}
