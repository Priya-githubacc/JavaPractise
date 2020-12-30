package Inheritance;


	class ReducingScopeOfModifeir1 {
// Scope of the modifier always starts from 
		 void main() {
		System.out.println("Parent - Main method");
		}

	}


	class ChileReducingScopeOfModifeir extends ReducingScopeOfModifeir1{

		void main() {
				System.out.println("Child - Main method");

		}

	}

	public class DifferenceIn_MethodsReturnTypes {
		public static void main(String[] args) {
			ReducingScopeOfModifeir1 ar=new ChileReducingScopeOfModifeir();
	 
			ar.main();
			}

		}
