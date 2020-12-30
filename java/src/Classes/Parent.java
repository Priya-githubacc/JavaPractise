package Classes;

public class Parent {

	static Parent p=new Parent();
	String s=null;
private Parent() {
	s="dfgdf";
	                                                  
} 

 Parent getInstance() {
	return p;
}

public static void m1() {
	System.out.println("Hello");
}

public  void m2() {
	System.out.println("Hiiii");
}
}
