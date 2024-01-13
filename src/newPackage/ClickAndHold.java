package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Stuff\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.click(driver.findElement(By.xpath("(//*[@class=' css-yk16xz-control'])[3]"))).build().perform();
		a.sendKeys("Green").sendKeys(Keys.ENTER).sendKeys("Blue").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		driver.close();
	}

}
