package basic;

public class PrimeNumber {

	public static void main(String[] args) {

int[] prime= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};

for(int i=0; i<=prime.length-1; i++) {
	
	
if(prime[i]!=1&&prime[i]%prime[i]==0&&prime[i]%2==0) {
	
	System.out.println(prime[i]+ " is a prime number..");
	
}
else {
//	System.out.println(prime[i]+ " is NOT a prime number..");
}
	
}

}

}
