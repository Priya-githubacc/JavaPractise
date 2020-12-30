package ExceptionHandling;



class TooYoungException extends RuntimeException{
	
	TooYoungException(String s){
		
	}
}

class ToooldException extends RuntimeException{
	ToooldException(String s){
		super(s);
	}
	
}
public class CustomizedORuserDefinedExceprions {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int age =555;
     
        if(age>55) {
        	throw new ToooldException("Too young to get married...");
        }
        else if(age<55) {
        	throw new TooYoungException("Too odd to get married...");
        }
        else {
        	System.out.println("Success...");
        }
	
	}

}
