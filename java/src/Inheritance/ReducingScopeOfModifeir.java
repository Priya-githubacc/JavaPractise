package Inheritance;

 class ReducingScopeOfModifeir1 {

	  void main() {
	System.out.println("Parent - Main method");
	}

}


class ChileReducingScopeOfModifeir extends ReducingScopeOfModifeir1{

	protected void main() {
			System.out.println("Child - Main method");

	}

}

public class ReducingScopeOfModifeir{
	public static void main(String[] args) {
		ReducingScopeOfModifeir1 ar=new ChileReducingScopeOfModifeir();
 
		ar.main();
		}

	}


