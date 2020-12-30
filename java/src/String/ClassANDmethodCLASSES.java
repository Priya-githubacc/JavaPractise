package String;

import java.lang.reflect.Method;

public class ClassANDmethodCLASSES {

	public static void main(String[] args) {

		int count = 0;
	 Object o=new String("Priya");
	 Class cls=o.getClass();
	 System.out.println("Fully qualified class name is :::"+cls);
	 
	 Method[] m=cls.getDeclaredMethods();
	 
	 for(Method m1:m) {
		 count++;
		 System.out.println(m1.getName());
		 
	 }
	 System.out.println(count);
	 
	 
 	 
	
	
	}

}
