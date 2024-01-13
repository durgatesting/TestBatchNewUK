package newPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nov18 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Stuff\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='oxd-icon orangehrm-sm-icon'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='oxd-icon orangehrm-sm-icon'])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='oxd-icon orangehrm-sm-icon'])[3]")).click();
		driver.findElement(By.xpath("(//*[@class='oxd-icon orangehrm-sm-icon'])[4]")).click();
		
		Thread.sleep(5000);
		
		Set <String> a = driver.getWindowHandles();
		Iterator<String> i = a.iterator();
		String parent = driver.getWindowHandle();
		//System.out.println(parent);
		while(i.hasNext())
		{
			String child = i.next();
			System.out.println(child);
			driver.switchTo().window(child);
			
			if(driver.getTitle().equals("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook"))
			{
				
				Thread.sleep(5000);
				//driver.findElement(By.xpath("(//*[@aria-label='Search'])[1]")).sendKeys("cartoons");
				Thread.sleep(5000);
				driver.close();
			}
			
			
		}
		driver.quit();
		
	}

}
