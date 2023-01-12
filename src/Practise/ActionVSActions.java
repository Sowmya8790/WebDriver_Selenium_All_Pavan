package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVSActions {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://automationpractice.com/index.php");
		
		WebElement women =driver.findElement(By.xpath("//a[text()='Women']"));
		
		Actions act = new Actions(driver); //Creating instance for Actions class ehich contans many methods.
		
		//act.moveToElement(women).build().perform(); 
		
		// If we call perform then internally it will call build.perform.
		// If we decalare a mothod and build that but did not perform then u can store that in action variable.
		
		Action action = act.moveToElement(women).build();
		action.perform();
		
	//	act.moveToElement(women).perform(); //act. with in perform class we have build.perform action 
		

	}

}
