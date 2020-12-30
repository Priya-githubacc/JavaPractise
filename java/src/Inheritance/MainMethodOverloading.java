package Inheritance;

public class MainMethodOverloading {

    public static void main(int args) {
		System.out.println("Int args - Main method");

	}

    public static void main1(String args) {
		System.out.println("String args - Main method");

    }
	
	public static void main(String[] args) {
		MainMethodOverloading ar=new MainMethodOverloading();
 
		ar.main(1);
		ar.main(1);
		ar.main1("bjh");
		
	}

}
