package basic;

public class Calling {

	public static void main(String[] args) {
		
		Standards sd=new Standards();
		sd.sum(777, 555);
		
		Standards.sum(10, 777);
		
		if(false)
		System.out.println("hiii");
		if(true)
			System.out.println("hello");
		else
		System.out.println("hello");
	
			
	}

}
