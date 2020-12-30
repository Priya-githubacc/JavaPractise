package Java_Practise;

import java.util.Scanner;

public class Test2_Swapping {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X, Y values....");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		//System.out.println("X and Y values before swapping --"+x+ " "+y);
		
		//x=x+y;
		//y=x-y;
		//x=x-y;
		
		//x=(x+y)-x;
		//y=(y+x)-y;
		
		//y=x;
		//x=y-x+(y);
		x=y-x+(y=x);
		//x+=y-=x=y -x;

		System.out.println("X and Y values after swapping ---"+x+ " "+y);
		

		//x=x*y;
		//y=x/y;
		//x=x/y;
		
	}

}
