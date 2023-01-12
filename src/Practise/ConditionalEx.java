package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.findElement(By.className("login")).click();
		
		WebElement email = driver.findElement(By.name("user_login"));
		WebElement pass =driver.findElement(By.name("user_pwd"));
		
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("Sowmi3v@gmail.com");
		}
		else
		{
			System.out.println("Email is not enabled");
		}
		
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("Sowmya@123");
		}
		else{
			
		System.out.println("Password is not enabled");
		}
		
		WebElement checkbox = driver.findElement(By.className("rememberMe"));
		checkbox.isSelected();
		
		if(checkbox.isSelected() == false)
		{
			checkbox.click();
			System.out.println("check box selected");
		}
		driver.findElement(By.name("btn_login")).click();
		System.out.println(driver.getTitle());
		

	}

}
