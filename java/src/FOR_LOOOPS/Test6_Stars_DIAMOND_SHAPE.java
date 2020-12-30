package FOR_LOOOPS;

public class Test6_Stars_DIAMOND_SHAPE {

	public static void main(String[] args) {
		/*
		 Display stars in the following way ::

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
		 */


		
		
		for(int i=1; i<6; i++) {
			
			for(int j=4; j>=i; j--) {
//					0>v';fohlp5[6970.217]3\172
//					'harsha weds reddy gi--------q'; j--) {
				System.out.print(" ");
				
			}
			for(int j=2; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
		
for(int i=1; i<5; i++) {
			
			
	for(int j=1; j<=i; j++) {
		System.out.print(" ");
		
	}
	
	for(int j=8; j>=i*2; j--) {
		System.out.print("*");
		
	}
	 
			System.out.println("");
		}
		
  }

}
