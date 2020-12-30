package Java_Practise;

public class Test3_SwappingStrings {

	public static void main(String[] args) {

	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter X, Y values....");
		String x = sc.nextLine();
		String y = sc.nextLine();
		sc.close();
	*/
		
		String x= "KALAM", y="ABDUL";
		System.out.println("X and Y values before swapping --"+x+ " "+y);
		
		String temp=x;
		x=y;
		y=temp;
			
		if(x=="ABDUL" & y=="KALAM") {
			
		System.out.println("X and Y values are swapped successfully...");
		System.out.println("X and Y values after swapping ---"+x+ " "+y);
		}
		else
		{
			System.out.println("X and Y values are not swapped...");
		}
	}

}
