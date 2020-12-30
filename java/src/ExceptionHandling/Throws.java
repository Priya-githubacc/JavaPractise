package ExceptionHandling;

public class Throws {

	public static void main(String[] args) throws Exception {

     doStuff();
	}

	private static void doStuff() throws InterruptedException  {

    Thread.sleep(10000);		
	}

}
