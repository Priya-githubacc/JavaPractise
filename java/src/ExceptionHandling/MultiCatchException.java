package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchException {

	public static void main(String[] args) {


		try {
			
			File file=new File("fgh.txt");
		}
		catch(Exception ee) {
			
		}
		catch(NullPointerException | ClassCastException  e) {
			
		}
	}

}
