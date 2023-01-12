package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameandiframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");  
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//if we wont switch to frame the we got exeception --> org.openqa.selenium.NoSuchElementException:
		
		
		
		driver.switchTo().frame("packageListFrame"); //given name of the iframe
		WebElement iframe1 = driver.findElement(By.xpath("//ul[@title='Packages']//a[@target='packageFrame']"));
		iframe1.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		WebElement iframe2 = driver.findElement(By.xpath("//span[normalize-space()='WebDriver']"));
		iframe2.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame"); 
		WebElement iframe3 = driver.findElement(By.xpath("//a[text()='Help']"));
		iframe3.click();
		

	}

}
