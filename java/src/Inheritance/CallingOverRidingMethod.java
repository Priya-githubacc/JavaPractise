package Inheritance;

public class CallingOverRidingMethod {


	public static void main(String...strings) {
		Overriding isar=new Overriding();
		isar.marry();
		
		Child c=new Child();
		c.marry();
		
		Overriding pc=new Child();
		pc.marry();
		
		/* BELOW ERROE WE GET
		
		java.lang.ClassCastException: Inheritance.Is_A_Relation cannot be cast to Inheritance.Child
		at Inheritance.CallingMethod.main
		
		Child cp=(Child) new Is_A_Relation();
		cp.marry();
		*/		
	}


}
