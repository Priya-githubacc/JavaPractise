package Inheritance;

public class CallingOverloadingMethod {

	public static void main(String[] args) {

		Overloading od=new Overloading();
		od.add(20,60);
		
		Overloading_1 od1=new Overloading_1();
		od1.add("20",30);
		
		Overloading_1 od2=new Overloading();
		od2.add("90",10);
		
		
	}

}
