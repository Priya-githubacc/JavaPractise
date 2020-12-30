package Java_Practise;


// FINAL - methods, classes, variables
// Final methods can't be overridden in the child class
//

public class Final_Uses {

	public final void thisIsFinalMethodCantOveride() {
		System.out.println("Don 't try to override it, because it's method has specified with the FINAL keyword");
				
	}
}

class child extends Final_Uses {
	
	public void thisIsFinalMethodCantOveride() {
		System.out.println("I am trying to override my parent class FINAL method...");
				
	}
}