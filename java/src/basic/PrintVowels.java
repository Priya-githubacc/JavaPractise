package basic;

public class PrintVowels {

	public static void main(String[] args) {

		String str="AEIUOaeiounn";
		System.out.println(str.length());
		int vowelsCount=0;
		
		boolean ss=str.equalsIgnoreCase(str);
		
		for(int i=0; i<=str.length()-1; i++) {
			
			if(str.charAt(i)==('a')||str.charAt(i)==('A')||str.charAt(i)==('e')||str.charAt(i)==('E') ||
					str.charAt(i)==('i')||str.charAt(i)==('I')
					||str.charAt(i)==('o')||str.charAt(i)==('O') 
					||str.charAt(i)==('u')||str.charAt(i)==('U') ){
				vowelsCount=vowelsCount+1;
			}
			
			
			
/*		for(int i=0; i<=str.length()-1; i++) {
		
		if(str.charAt(i)==('a')||str.charAt(i)==('A')||str.charAt(i)==('e')||str.charAt(i)==('E') ||
				str.charAt(i)==('i')||str.charAt(i)==('I')
				||str.charAt(i)==('o')||str.charAt(i)==('O') 
				||str.charAt(i)==('u')||str.charAt(i)==('U') ){
			vowelsCount=vowelsCount+1;
		}
	*/	
		
		/* if() {
			vowelsCount=vowelsCount+1;
		} if(str.charAt(i)=='i') {
			vowelsCount=vowelsCount+1;
		} if(str.charAt(i)=='o') {
			vowelsCount=vowelsCount+1;
		} if(str.charAt(i)=='u') {
			vowelsCount=vowelsCount+1;
		}*/
	}
		System.out.println("vowelsCount "+vowelsCount);
		System.out.println("Consonents "+(str.length()-vowelsCount));

  }
}
