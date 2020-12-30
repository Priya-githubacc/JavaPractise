package constructors;

public class Cons1 {

	
String name;
int roll_no;

Cons1(String name, int roll_no){
	this.name = name;
	this.roll_no = roll_no;
	System.out.println(roll_no);
}
	public static void main(String[] args) {
    Cons1 c1=new Cons1("Priya", 101);
    System.out.println(c1.name);
 
    
	}

}
