package FOR_LOOOPS;

public class Test1_Sample_Programs {

	public static void main(String[] args) {
		// For loop first program
		
		//Loop :: Display 1 3 5 3 1
		for(int i=1; i<=5; i=i+2) {
			
			System.out.print(i+" ");
			
		}
		for(int j=3; j>=1; j=j-2) {
			
			System.out.print(j+" ");
			
		}
		
/*	    //Loop - 1	:: To display numbers from 1 to 10 
		System.out.println("display numbers from 1 to 10 :::");
		for(int i=1; i<=10; i++) {		  
	      System.out.print(" "+i);
		}
		 System.out.println("\n");
		
	  //Loop - 2 :: To display odd numbers till 10
	  System.out.println("display ODD numbers from 1 to 10 :::");
	  for(int i=1; i<=10; i=i+2) {
	      System.out.print(" "+i);
	  }

	    System.out.println("\n");

	  //Loop -3 :: To display even number till 10
	  System.out.println("display EVEN numbers from 1 to 10 :::");
	  for(int i=0; i<=10; i=i+2) {
	      System.out.print(" "+i);
	  }
	  System.out.println("\n");
		  
	  //Loop - 3 :: Display numbers from 10 to 1
	  System.out.println("Display number from 10 to 1 till 10 :::");
	  for(int i =10; i>=0; i--) {
		  System.out.print(" "+i);
	  }
	  System.out.println("\n");
	  
	//Display multiplication table eg., 1X2=2 till 10 times
	  System.out.println("\n2 table is :: ");
	  for(int i=1; i<=10; i++) {
		  
		  System.out.println(i+"X"+"2"+"="+i*2);

	  }
	  System.out.println("\n");
	  
	  //Display 3 table till 20 times 
	  System.out.println("3 table is :::");
	  int x=3;
	  for(int i=1; i<=20; i++) {
		  System.out.println(i+"X"+x+"="+i*3);
	  }
	 
	  
/*	 // Inifinite loop
	  for(; ;) {
		  System.out.println("Loop will run multiple time as there is no condition..."
		  		+ "\n"
		  		+ "\n"
		  		+ "Remember that it will infinate times, you need to terminate manually....");
	}
	*/
	 
	  
	  
	}

}
