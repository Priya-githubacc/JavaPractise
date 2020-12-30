package Generics;

import java.util.ArrayList;

public class GenericMethods_OR_WildCardMethods {
	
	public <String> void m1(ArrayList<?> l) { 
		l.add("sd");
		

System.out.println("HIII");
		
	}

/*	public void m1(String l) {
		// TODO Auto-generated method stub
	if( l instanceof String) {
			System.out.println("Yes...");
		}
	}
*/
}
