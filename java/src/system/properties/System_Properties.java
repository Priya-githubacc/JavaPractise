package system.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class System_Properties {

	public static void main(String[] arg) throws Exception {
		
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.name"));
		System.setProperty("os.name","MAC");
		System.out.println(System.getProperty("os.name"));

		System.out.println(System.getenv());
		System.out.println(System.getenv("LOCALAPPDATA"));
		System.out.println(System.getenv("JAVA_HOME"));
		/*
		 	System.setProperty("webdriver.edge.driver","E:\\SeleniumAutomation\\msedgedriver.exe");
		 */
		
		System.setProperty("webdriver.edge.driver","E:\\SeleniumAutomation\\msedgedriver.exe");
		System.out.println(System.getProperty("webdriver.edge.driver"));
		
		FileReader fr=new FileReader(System.getProperty("user.dir")+"/config.properties");
		BufferedReader bf=new BufferedReader(fr);
		Properties p=new Properties();
		p.load(bf);
		System.out.println(p.getProperty("url"));
		p.setProperty("Email", "priya@777.com");
		fr.close();
		bf.close();
		
		
	}

}
