package constructors;

public class ParentClassConstructor{
	
	public int x;
	public ParentClassConstructor() {
		x=20;
		System.out.println(x);
	}
}
	 
class child1 extends ParentClassConstructor{
		public int x;
		
		/* child1(int i, int i1) {
          //  super();
			this.x=10;
			System.out.println(x);
		}*/
	
		 child1(){
			// super();
			 this.x=10;
			 System.out.println(x);
		 }
		 
		 child1(int i){
			 this();
		 }

}