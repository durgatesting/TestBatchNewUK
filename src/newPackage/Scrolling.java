package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Stuff\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	// implicit Wait	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//WebDriverWait w  =  new WebDriverWait(driver,10);
	//Explicit wait 	w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		Wait <WebDriver> w  =  new FluentWait<WebDriver>(driver)
				.withTimeout(20 , TimeUnit.SECONDS).
				pollingEvery(2, TimeUnit.SECONDS);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
				
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}

}
