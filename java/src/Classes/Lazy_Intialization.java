package Classes;

public class Lazy_Intialization {
	
	private static Lazy_Intialization lzy=null;
	
	private Lazy_Intialization(){
		
	}

	public static Lazy_Intialization Lazy_Intialization() {
		if(lzy==null) {
			lzy=new Lazy_Intialization();
		}
		
		return lzy;
	}
	
	public Lazy_Intialization m1() {
		
		return lzy;
	}
	
public Lazy_Intialization m1(int a, int b)  {
		
	
		return lzy;
	}
}
