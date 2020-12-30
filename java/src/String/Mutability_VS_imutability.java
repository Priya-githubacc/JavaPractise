 package String;

public class Mutability_VS_imutability {

	public static void main(String[] args) {
		
		Object ob=new String("Durga");
		Object ob1=new String("Durga ");
		Object ob2=ob;
		System.out.println("Object class ;;;;"+ob.equals(ob1));

String s=new String("Durga");
String s1=new String("Durga");

//String ss=s.concat(" Soft");
//System.out.println(ss);

s.concat(" Soft");
System.out.println(s==s1);
System.out.println(s.equals(s1));
//System.out.println(s);
       
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

StringBuffer sb=new StringBuffer("Durga");
StringBuffer sb1=new StringBuffer("Durga");
StringBuffer sb3=sb1;

sb.append("Soft");
//System.out.println(sb);
System.out.println(sb==sb1);
System.out.println(sb3.equals(sb1));

String ss=new String();

ss=ss.concat("10");
System.out.println("jhgjh "+ss);
ss.
	}

}
