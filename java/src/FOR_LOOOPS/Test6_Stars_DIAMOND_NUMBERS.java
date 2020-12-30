package FOR_LOOOPS;

public class Test6_Stars_DIAMOND_NUMBERS {

	public static void main(String[] args) {
		/*
		 Display numbers in the following way ::

        
        
		 */


		
		
		for(int i=0; i<=5; i--) {
			
		
			for(int j=5; j>=i; j++) {
				System.out.print(" ");
			}
			
			for(int j=5; j>=i; j--) {
				System.out.print("p");
			}
			
			System.out.println("");
		}
	
		
/*for(int i=1; i<5; i++) {
			
			
	for(int j=1; j<=i; j++) {
		System.out.print(" ");
		
	}
	
	for(int j=8; j>=i*2; j--) {
		System.out.print("*");
		
	}
	 
			System.out.println("");
		}*/
		
  }

}
