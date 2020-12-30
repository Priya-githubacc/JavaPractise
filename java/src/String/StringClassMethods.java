package String;

public class StringClassMethods {

	public static void main(String[] args) {

		String s=new String("PriyaBharath");
		System.out.println(s.equals("PriyaBharath"));
		System.out.println(s.equals(s+"loves"));
		System.out.println(s.concat(" Loves for ever"));
		System.out.println(s.substring(5));
	//	System.out.println(s.substring(100));
		System.out.println("Chat at ----" +s.charAt(5));
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,10));
		System.out.println(s.length());
		
		String str=" abababa ";
		System.out.println(str.replace('a', 'b'));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());

		
	}

}
