package Java_Practise;

class Parent {

		// Final method --> Parent class methods can't be override by the child class methods
		public  void m1() {
			System.out.println("Method1 from parent class...");
		}
}
// Here showing error at child class method m1 as it's can't be override by the parent class method m1 
//because it's declared with "FINAL" keyword...
class Child extends Parent {
	public void m1() {
		System.out.println("Method1 from child class...");
	}

}
class Fianl_KeyWord_Concept
{
	public static void main(String[] args) {
		Parent c=new Parent();
          c.m1();
 }
}