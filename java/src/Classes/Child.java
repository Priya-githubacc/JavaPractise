package Classes;

public class Child {

	public static void main(String[] args) {


	//Parent p1=new Parent();
	Parent p = Parent.p;
	Parent p1= Parent.p;
	
	if(p==p1) {
		System.out.println("Yes");
	}else {
		System.out.println("Nop");
	}
	p.m1();
	p.m2();
	//
	
		Parent.m1();
	}

}
