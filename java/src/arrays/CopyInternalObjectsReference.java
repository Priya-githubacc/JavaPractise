package arrays;

public class CopyInternalObjectsReference {

	public static void main(String[] args) {

		int[] a= {77, 577, 177, 207};
		int[] b= {777, 106};
		a=b;
		b=a;
		System.out.println(a[1]);
		System.out.println(b[1]);

	}

}
