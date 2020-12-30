package Java_Practise;

import java.util.ArrayList;

public class ArraysDeclarationInCandJAVA {

	public static void main(String[] args) {
		
		// In C language
		int[] c=new int[5];
		int[] cc= {4,4,64,45,5};
		c[0]=1;
		c[1]=2;
		c[2]=55;
		
		for(int i=0; i<cc.length; i++) {
			System.out.println(cc[i]);
		}

		// In JAVA language
		ArrayList<Integer> java=new ArrayList<Integer>();
		java.add(10);
		java.add(20);
		java.add(66);
		java.add(777);
		java.add(99);
		
		for(int i=0; i<java.size();i++) {
			
		
		System.out.println(java.get(i));
		}
		
	}

}
