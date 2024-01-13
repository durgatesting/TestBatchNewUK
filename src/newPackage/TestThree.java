package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestThree {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Automation_Stuff\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	String x = driver.getCurrentUrl();
	System.out.println(x);
	//secured/not
	
	if(x.contains("https"))
	{
		System.out.println("securable site");
	}
	else
	{
		System.out.println("Unsecurable site");
	}
	
	
driver.close();
	

	}


}
