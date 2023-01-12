package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextandGetAtribute {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");

		driver.findElement(By.className("login")).click();
		
		WebElement email = driver.findElement(By.name("user_login"));
		email.sendKeys("Sowmi3v@gmail.com");
		
		System.out.println("The attribute of the element " +email.getAttribute("type"));
		System.out.println("The text of the elememtt " +email.getText());  //no inner text is there
		
		driver.findElement(By.name("user_pwd")).sendKeys("Sowmya@123");
		
		//logun button
		
		WebElement login = driver.findElement(By.className("content-sub-heading"));
		
		
		System.out.println("The attribute of the element " + login.getAttribute("class"));              
		System.out.println("The Text of the element " +login.getText());
		
		

	}

}
