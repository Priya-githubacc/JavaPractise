
 public class ParentClass {

	class childClass{
		public void m1() {
			System.out.println("It's child inner class method");

		}

	}
	public static void main(String[] args) {

		// Approach 1
		ParentClass in=new ParentClass();
		ParentClass.childClass cc=in.new childClass();
		cc.m1();
		
		// Approach 2
		ParentClass.childClass cc1=new ParentClass(). new childClass();
		cc1.m1();
		
		// Approach 3
		new ParentClass(). new childClass().m1();
		

	}

}
