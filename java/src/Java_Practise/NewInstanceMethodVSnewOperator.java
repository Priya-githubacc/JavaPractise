package Java_Practise;

import net.bytebuddy.dynamic.scaffold.TypeWriter.Default.ValidatingClassVisitor.Constraint.ForClass;

public class NewInstanceMethodVSnewOperator {

	public static void main(String[] args) {
		// Difference between instanceOfmethod and new operator
		// We can create onject to any class using its constructor when we class name before hand, so that we can create 
		// object directly to that known class...
		// If we don't know class name before hand then 'newInstance()' can be used to provide class at the runtime
		// and it's in the java.lang.Class package where as the 'new' operator is in JAVA
		
		Object o= Class.forName(args[0]).newInstance();
		System.out.println(o.getClass().getName());

	}

}
