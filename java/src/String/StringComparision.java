package String;

public class StringComparision {

	public static void main(String[] args) {


		String s1="Priya";
		String s2="Priya";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());
			
		
		String s11=new String("Priya");
		String s22=new String("Priya");
		System.out.println(s11.equals(s22));
		System.out.println(s11==s22);
		System.out.println(s11.hashCode());
		System.out.println(s22.hashCode());
		
		
	}

}
