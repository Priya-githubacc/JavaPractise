package Java_Practise;

public class Constructor {

	int a;
	int b;
	
	public Constructor(int i, int j) {
		// TODO Auto-generated constructor stub
		a=10;
		b=777;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor con= new Constructor(10, 20);
		int x=con.a;
		System.out.println(x);
	}

}
