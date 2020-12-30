package system.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Writer;
import java.util.Properties;

public class Add_New_ValuesToProperties_File {

	public static void main(String[] args) throws Exception {

Properties prop=new Properties();
FileInputStream fis=new FileInputStream("user1.txt");
prop.setProperty("user txt", "user txt");

FileOutputStream fos=new FileOutputStream("user.txt");

prop.store(fos, "comments...");



	}

}
