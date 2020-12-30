package basic;

public class FindNoOfSpaces_AND_NoOfWordInAsentence {

	public static void main(String[] args) {

    String s="I  am a positive minded girl";
        
    
    int words=0, spaces=0;
    
    for(int i=0; i<=s.length(); i++) {
    if(s.charAt(i)==' ') {
    	
    	spaces=spaces+1;
   	
    }else {
    	
    	

    	if(s.charAt(i)!=' ') {
    		for(int j=0; )
    	words=words+1;
    	}
    	
    	
      }
	 }
	}
}
