package arrays;

public class AnonimousArrays {

	public static void main(String[] args) {

		int[] b;
		sum(b=new int[]{10,02,30});
		
	}

	public static void sum(int[] a) {
		int total = 0;
		
		for(int a1:a) {
			total=total+a1;
			System.out.println(a1);
		}
		System.out.println("Toatal"+total);
	}
}
