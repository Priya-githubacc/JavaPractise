package ExceptionHandling;

public class Parent {
	
	void m() {
		System.out.println("Method...");
	}


	public static void main(String[] args) {
Parent p=new Parent();
System.out.println(p.a);
	}
	
	int b=888;
	{
		System.out.println(b);
	}
	 int a =777;
	/*	static {
		System.out.println("Staic 1i is ="+a);
	}
*/}
