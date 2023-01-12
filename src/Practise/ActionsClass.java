package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");  //wedriver is interface
		WebDriver driver = new ChromeDriver();  // create a object with instance of webdriver.
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		Alert al = driver.switchTo().alert();
		edit.click();
		
		al.accept();
		
	}

}
