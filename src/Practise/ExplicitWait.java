package Practise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	
	/*	WebDriverWait mywait = new WebDriverWait(driver, 10);
		
	
		
		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")));
		element.click();*/
		
		//Calling the generic method
		By ele = By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']");
		WaitForElementPresent(driver, ele, 10);
		
		
	}
		//Generirc method
		
		public static WebElement WaitForElementPresent(WebDriver driver, By locator, int timeout) {
			
			WebDriverWait mywait = new WebDriverWait(driver, timeout);
			mywait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
			return driver.findElement(locator);
			
			
		}
		
		

		
		

	

}
