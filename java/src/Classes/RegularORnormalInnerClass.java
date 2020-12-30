package Classes;

public class RegularORnormalInnerClass {
	
	public class InnerClass{
		public void m1() {
			System.out.println("This is inner class method...");
		}
	}

	public static void main(String[] args) {
		// Call inner class

		//Way 1 to call inner class
		RegularORnormalInnerClass r=new RegularORnormalInnerClass();
		RegularORnormalInnerClass.InnerClass ic=r.new InnerClass();
		ic.m1();
		
		//Way 2 to call inner class
		RegularORnormalInnerClass.InnerClass rOrN=new RegularORnormalInnerClass(). new InnerClass();
		rOrN.m1();
		
		//Way 3 to call inner class
		new RegularORnormalInnerClass(). new InnerClass().m1();
		
	}

}
