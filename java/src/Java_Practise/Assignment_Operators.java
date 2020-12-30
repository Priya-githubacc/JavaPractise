 package Java_Practise;

public class Assignment_Operators {

	public static void main(String[] args) {
		// Simple assignment
		int simple=777;
		System.out.println(simple);
		
		//Chained assignment
		int a,b,c,d; 
		a=b=c=d=7777;
		System.out.println(a+"...."+b+"....."+c+"....."+d);
		
		// Compound assignment
		byte byt=127;
		byt=(byte) (byt+111);
		System.out.println("Compound Assignment variable value is --> "+byt);
		
		// Chained compound assignment
		int x,y,z,w;
		x=y=w=z=10;
		x+=y-=z*=w/=2;
		System.out.println(x+"\n"+y+"\n"+z+"\n"+w);
		
		// Ternary assignment operator
		int x1=(100>20?110:30);
		System.out.println(x1);
		
		// Nesting of ternary assignment operator
		int y1=(11>2?(777>77?(10>77?1777:177):0):(277>70?7770:717));
		System.out.println(y1);
		
		
	}

}
