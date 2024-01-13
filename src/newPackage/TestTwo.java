package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Stuff\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/downloads");
		Thread.sleep(5000);
		String expected = "ChromeDriver - WebDriver for Chrome - Download";
		String actual = driver.getTitle();
		
		System.out.println(actual);
		
		
		if(expected.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("title got mismatched hence test failed");
		}
		
		driver.close();
		
	}

}
