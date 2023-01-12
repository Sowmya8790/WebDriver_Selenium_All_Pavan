package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MrthodsEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s");
		System.out.println(driver.getTitle());
	
		
		//driver.findElement(By.id("nav-tools")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.findElement(By.className("a-truncate-cut")).getText());
		
		//driver.close(); // close currect window
		//driver.quit(); // close mutiple windows
		
		
		
		
		
		

	}

}
