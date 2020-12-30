package Classes;

public class Single1 {

/*	 static Single1 s=new Single1();
	private Single1() {
	}
	
	public Single1 getText() {
		return s;
	}
	
	*/ 
	
	public int x;
	public int y;
	
	private Single1(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public static Single1 initiate(int a, int b) {
		
		
	Single1 ob=new Single1(a,b);
		return ob;
	}
	
	public int add() {
		int z=x+y;
		return(z);
	}
}
