package Classes;

public class Call_Eager_Intialization {

	public static void main(String[] args) {
		Eager_Initialization eg1=Eager_Initialization.egaer();
		eg1.s=eg1.s.toUpperCase();
		System.out.println(eg1.s);
		eg1.s="dfgdfgdf";
		System.out.println(eg1.s);	
		
		Eager_Initialization eg2=Eager_Initialization.egaer();
       // System.out.println(eg2.s);
		eg2.s="777777";
        
		System.out.println(eg1.s);	

		System.out.println(eg2.s);
		Eager_Initialization eg3=Eager_Initialization.egaer();
       System.out.println(eg3.s);

		eg1.m1();
		
		System.out.println(eg1);
		System.out.println(eg2);

		System.out.println(eg3);

		
		//THIS IS EA...
		// dsfsdfsdf
		//777777
		//777777
		//77777
	}

}
