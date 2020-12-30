package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringToCharArray {

	public static void main(String[] args) {

		
		ArrayList s=new ArrayList();
		s.add(55);

		s.add("Priya");
		s.add(55);
		s.add(777);
		System.out.println(s);

		int x1=(int) s.get(0);
		
		String x="Priya";
char[] y=x.toCharArray();
System.out.println(y);

Collection c=new ArrayList();
c.add("777");
c.add(15);
c.add(700);
String ss=(String) ((ArrayList) c).get(0);

	}

}
