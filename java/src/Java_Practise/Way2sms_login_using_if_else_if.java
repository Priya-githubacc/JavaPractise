package Java_Practise;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Way2sms_login_using_if_else_if {

	public static void main(String[] args) throws Exception {
		// Take test data from keyboard
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter mobile number...");
	    String mobile_number=sc.nextLine();
	     
	    System.out.println("Enter mobile number criteria...");
	    String mobile_number_criteria = sc.nextLine();
	    
	    System.out.println("Enter password");
		String password=sc.nextLine();
		
		System.out.println("Enter password criteria...");
		String password_criteria=sc.nextLine();
		
		
		//Open browser
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumAutomation\\java\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Launch site and do login
		driver.get("http://www.way2sms.com");
		Thread.sleep(5000);
		driver.findElement(By.id("mobileNo")).sendKeys(mobile_number);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("(//button[contains(text(),'Login')])[1]")).click();
		Thread.sleep(5000);
		
		try{
		
		//Validation
		
		//if(mobile_number.length()==0 && ((driver.findElement(By.xpath("//b[text()='Enter valid mobile number']")).isDisplayed()) || (driver.findElement(By.xpath("//b[text()='Enter your mobile number']")).isDisplayed()))){
		if(mobile_number.length()==0 && (driver.findElement(By.xpath("//b[text()='Enter valid mobile number'] || //b[text()='Enter your mobile number']")).isDisplayed())){
		System.out.println("Mobile number blank value test passed....");
		}
		else if(mobile_number.length()>0 && mobile_number.length()<10 && driver.findElement(By.xpath("//b[text()='Enter valid mobile number']")).isDisplayed()){
		System.out.println("Wrong size - mobile number test passed....");
		}
		
		else if(mobile_number.charAt(0)!='6' && mobile_number.charAt(0)!='7' && mobile_number.charAt(0)!='8' && mobile_number.charAt(0)!='9' && driver.findElement(By.xpath("//b[text()='Invalid Mobile Number']")).isDisplayed()) {
		System.out.println("Wrong series mobile number test passed...");
		}
		else if(password.length()==0 && driver.findElement(By.xpath("//b[text()='Enter password'][1]")).isDisplayed()){
		System.out.println("Blank password test passed...");
		}
		else if(mobile_number_criteria.equals("invalid") && password_criteria.equals("valid") && driver.findElement(By.xpath("(//*[contains(text(),'not register')])[1]")).isDisplayed()){
		System.out.println("Invalid mobile number test passed...");
		}
		
		else if(mobile_number_criteria.equals("valid") && password_criteria.equals("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'Try Again')])[1]")).isDisplayed()){
		System.out.println("Invalid password test passed...");
		}
		
		else if(mobile_number_criteria.equals("valid") && password_criteria.equals("valid") && driver.findElement(By.xpath("(//*[text()='Send SMS')])[1]")).isDisplayed()){
		System.out.println("Valid data test passed...");
		}
		
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		System.out.println("==================================================");
		}
    }
}
