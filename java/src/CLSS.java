
public class CLSS {

	int i1=10;
	static int i2=100;
	public static  void validate(int i){

              if(i==10){

            	  System.out.println("Yes");
          	}

	}
	
	public static void main(String[] args) {

		CLSS c=new CLSS();
		
		validate(10);
		System.out.println(c.i1); // This can not be called with out object creation as instance 
		//members can't be called directly, only static members can be called directly as static 
		//members will be loaded at the time of class loading...
		System.out.println(i2); 
		
	}

}
