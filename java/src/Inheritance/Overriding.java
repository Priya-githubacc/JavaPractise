package Inheritance;

public class Overriding {

	public void property() {
		System.out.println("Land+Cash+Gold+Diamonds+Building");
	}
	
	public void marry() {
		System.out.println("PARENT");
	}
}

class Child extends Overriding{
	public void marry() {
		System.out.println("Child");
	}
}

 class MainMethod {}