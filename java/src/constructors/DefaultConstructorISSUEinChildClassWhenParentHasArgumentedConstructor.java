package constructors;

 class parent {
	
	 int i1;
	 int j1;
	 
	 parent(){
		 
	 }

	parent(int i, int j){
		this.i1=i;
		this.j1=j;
		i=20;
		j=23;
		System.out.println(i+j);
	}

}

class child55 extends parent{

	//private static int j;

	child55(int i, int j) {
		super(i,j);
System.out.println(i);	
}	
}
class child65 extends parent{
	 child65(){
		 super();
	 }
}
