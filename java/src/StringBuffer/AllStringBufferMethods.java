package StringBuffer;

public class AllStringBufferMethods {

	public static void main(String[] args) {

    StringBuffer sb=new StringBuffer("Priya Bharath");

    // System.out.println(sb.reverse());
    ////Way 2 -- To print a string in reverse order
    ///
    System.out.println(sb.length());
    for(int i=sb.length()-1; i>=0; i--) {

    	System.out.print(sb.charAt(i));
    }
    System.out.println();
    ///All SB methods
    
     StringBuffer sb1=new StringBuffer();
    System.out.println(sb1.capacity());
    System.out.println(sb1.append(true));
    System.out.println(sb1.capacity());
    System.out.println(sb1.append("Ilovemyselfilovebharathwebothloveeachotherimmensly"));
    System.out.println(sb1.capacity());
    
    
    StringBuffer s777=new StringBuffer("PriyaPriya");
    s777.delete(1, 4);
    System.out.println(s777);
   
    
    String split=new String("I am good I am fine");
    
    String a[]=split.split("\\s");
    String aa[]=split.split("\\s", -2);
    for(int i=0; i<=aa.length-1; i++) {
    System.out.println(aa[i]);
    
	}
	}
}
