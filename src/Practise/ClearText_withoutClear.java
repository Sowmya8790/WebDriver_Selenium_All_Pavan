package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText_withoutClear {

	public static void main(String[] args) {
	
		System.getProperty("WebDriver.chrome.driver","Chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement login = driver.findElement(By.xpath("//input[@id='Email']"));
		
	//	login.clear();
		
/*		login.sendKeys(Keys.CONTROL,"a");
		login.sendKeys(Keys.CLEAR);
		login.sendKeys("admin@yourstore.com");*/
		
		//Using teh above code in single line using chord
		
		login.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.CLEAR));
		login.sendKeys("admin@yourstore.com");
	//	driver.close();
		

	}

}
