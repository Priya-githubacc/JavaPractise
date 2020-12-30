package String;

import java.lang.reflect.Method;

public class PrintAllTheMedthosInsideAStringClass {

	public static void main(String[] args) {

		int count=0;
		
		String s=new String();
		Class cls=s.getClass();
		System.out.println(cls.getName());
		System.out.println(s.getClass());
		
		Method[] m=cls.getDeclaredMethods();
		System.out.println("All the methods present inside String class are:");
		for(Method m1:m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println(count);
	}

}
