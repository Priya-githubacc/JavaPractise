package Java_Practise;

strictfp public class Basic_Level {
	
	int[] x=new int[3];	
	strictfp static float m1() {
		float f=10;
		return (f/3);
		 
	}

	public static void main(String... args) {
		//We can't use java reserved words as identifiers, but we can use 
		// predefined classes/interfaces names as identifiers, but it's not a good programming practise
		String Date="";
		int Runnable=20;
		int Thread =777;
		float f=(float) 10.0;
		System.out.println("sdsd"+f/3);
		float d=m1();
		System.out.println(d);
		
		byte bbb=(byte) 128;
		System.out.println("sdsd123132"+bbb);
		System.out.println("sdsd123 \r132 dfd");
		//local variable
	
		Basic_Level t=new Basic_Level();
		System.out.println("..."+t.x);
		System.out.println(".."+t.x[0]);
	}

}
