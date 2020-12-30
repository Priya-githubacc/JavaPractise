package String;

public class Cloning implements Cloneable{
	
	int i=10, k=30;
	int j=20;

	public static void main(String[] args) throws CloneNotSupportedException {

Cloning c=new Cloning();
Cloning c1=(Cloning) c.clone();

c1.i=25;
System.out.println(c1.i);



	}

}
