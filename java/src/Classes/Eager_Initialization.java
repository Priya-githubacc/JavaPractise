package Classes;

public class Eager_Initialization {

	private static Eager_Initialization ei=new Eager_Initialization();
	
	String s;
	private Eager_Initialization() {
		s="This is eager initialization";
	}
	
	public static Eager_Initialization egaer() {
		return ei;
	}
	
	public void m1() {
		
	}
	
}


