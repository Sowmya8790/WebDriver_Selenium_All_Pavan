package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@id='input-username']"));
		user.sendKeys("Sowmya143");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("Sowmya@123");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button"));
		login.click();
		
		
		

	}

}
