package Classes;

import okhttp3.Call;

public class CallingInnerNouterClassOBJECTS {

	public int x=245;
	int y=255;
	class inner {
		public int x=777;
	public void m1() {
		 int x=666;
		 System.out.println(x);
		 System.out.println(this.x);
		 System.out.println(inner.this.x);
		 System.out.println(CallingInnerNouterClassOBJECTS.this.x);
		 System.out.println(y);
		
	}
	}
	public static void main(String[] args) {

		new CallingInnerNouterClassOBJECTS().new inner().m1();
	}

}
