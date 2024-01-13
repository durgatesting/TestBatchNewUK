package newPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MobileAppVD {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
			
		//Mobile launch
		DesiredCapabilities c  =  new DesiredCapabilities();
		c.setCapability("deviceName", "PBRSAYWGVWWWRWZH");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "13.0");
		//Thread.sleep(5000);

		//app launch
		c.setCapability("appPackage", "com.oneplus.calculator");
		c.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		Thread.sleep(3000);
		
		URL u = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver;
		driver =  new RemoteWebDriver(u,c);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@text='9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc = 'Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc = 'Equals']")).click();
		Thread.sleep(3000);
		String x  = driver.findElement(By.xpath("//*[@resource-id = 'com.oneplus.calculator:id/result']")).getText();
System.out.println("Output of calculator : "  +x);
	}

}
