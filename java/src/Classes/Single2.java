package Classes;

public class Single2 {

	public static void main(String[] args) {
    
		Single1 s1=Single1.initiate(10, 20);
		System.out.println(s1);
		
		int x=s1.add();
		System.out.println(x);
		
		Single1 s2=Single1.initiate(30, 40);
		
		
		if(s1==s2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	
	}

}
