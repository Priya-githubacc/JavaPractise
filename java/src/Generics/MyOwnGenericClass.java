package Generics;

public class MyOwnGenericClass<TT, T>
{
T ob2; 
TT ob1;

public MyOwnGenericClass(TT obj, T ob) {

this.ob1=obj;
this.ob2=ob;


}
public void show() {
System.out.println("The type of TT is ::" + ob1.getClass().getName());
System.out.println("The type of T is:: "+ob2.getClass().getName());
}
/*
public T getObject() {
	return (T) ob1;
	
}*/


public TT getObject1() {
	return ob1;
	
}
public T getObject2() {
	return ob2;
	
}
}
