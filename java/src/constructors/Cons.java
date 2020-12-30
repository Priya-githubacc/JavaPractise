package constructors;

public class Cons {

	int i=10;
	Cons(int i){
		
	}
	

} 
class child extends Cons{
	 int i=20;
	child(int i) {
		super(i);
System.out.println(i);	}




	public static void main(String args[])
	{
	child c=new child(30);
}
}