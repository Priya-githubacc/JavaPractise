package Inheritance;

public class Overloading_1{
	
	
	
	public void add(String a, int b) {
		String c= a+b;
		System.out.println(" '+' is useful also for CANTENATION"+c);
	}
}

 class Overloading extends Overloading_1{

	
	 public void add(int a, int b) {
			int c= a+b;
			System.out.println(" '+' is useful for addition"+c);
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

}
