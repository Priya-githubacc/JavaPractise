package Generics;

import java.util.ArrayList;

public class CallMyOwnGenericClass {

	public static void main(String[] args) {
		GenericMethods_OR_WildCardMethods obj=new GenericMethods_OR_WildCardMethods();
		ArrayList<String> d=new ArrayList<String>();
		
		obj.m1("dfg");
		obj.m1("sdf");
	}

}
