package newPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RealDevice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Mobile
		
		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability("deviceName", "PBRSAYWGVWWWRWZH");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "13.0");
		
		//app 
		c.setCapability("appPackage", "com.oneplus.calculator");
		c.setCapability("appActivity", "com.android.calculator2.Calculator ");
		URL  u  = new URL ("http://127.0.0.1:4723/wd/hub");
		
		WebDriver driver;
		driver = new RemoteWebDriver(u,c);
		
		driver.findElement(By.xpath("//*[@text='9']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@text='6']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@content-desc = 'Add']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@text='7']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@text='8']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@content-desc = 'Equals']")).click();
		 Thread.sleep(5000);
		 
		 String x = driver.findElement(By.xpath("//*[@resource-id = 'com.oneplus.calculator:id/result']")).getText();
		 System.out.println(x);
	
	}

}
