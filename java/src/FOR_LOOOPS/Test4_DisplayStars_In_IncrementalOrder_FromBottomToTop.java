package FOR_LOOOPS;

public class Test4_DisplayStars_In_IncrementalOrder_FromBottomToTop {

	public static void main(String[] args) {
		/*
		 Should display like this           
           *****
           ****
           ***
           **
           * 
		 */
		//Way - 1
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//Way - 2
        
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
