package Practise;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitEx1 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//windowhandle
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement elemente = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		elemente.sendKeys("Sowmya");
		elemente.sendKeys(Keys.RETURN);
		
		WebDriverWait mywait = new WebDriverWait(driver,90);
		WebElement element = (WebElement) mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h3[text()='S. Sowmya Songs - JioSaavn']")));
		
		element.click();

	}

}
