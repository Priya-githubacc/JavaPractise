package Generics;

import java.util.HashMap;

public class CallingFromHere{
	public static void main(String args[]) {
		
		MyOwnGenericClass<String, String> obb=new MyOwnGenericClass<String, String> ("Priya", "Bharath") ;
		obb.show();
		obb.getObject1();
		
		HashMap<Integer, String> is=new HashMap<Integer, String>();
		is.put(777, "Priya");
		is.put(777, "Bharath");
	}
}