package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkTextEx {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?");
		
	/*	WebElement bestseller = driver.findElement(By.linkText("Best Sellers"));
		bestseller.click();*/
		
		//Using partial link text
		WebElement bestseller = driver.findElement(By.partialLinkText("Sellers"));
		bestseller.click();
		
		//to find all the linktext
		
		List<WebElement> taga = driver.findElements(By.tagName("a"));
		System.out.println(taga.size());
		
		for(WebElement alltag:taga)
		{
			System.out.println(alltag.getAttribute("href"));
			System.out.println(alltag.getText());
		}
		

	}

}
