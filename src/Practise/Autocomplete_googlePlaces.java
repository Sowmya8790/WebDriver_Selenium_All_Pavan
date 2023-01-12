package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete_googlePlaces {

	public static void main(String[] args) throws InterruptedException {
	//In maps er can see this type of drop down whuch we cant inspect
	System.setProperty("Webdriver.chrome.driver", "ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.twoplugs.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
	WebElement text = driver.findElement(By.id("autocomplete"));
	text.clear();
	
	// if we click on downarrow key it moving to next and that option display on serch box.
	String textselect;
	do {
		
		text.sendKeys(Keys.ARROW_DOWN);
		textselect = text.getAttribute("value");
		
		if(text.equals("Toronto, OH, USA")) {
			
			text.sendKeys(Keys.ENTER);
			break;
		}
		
		}while(!textselect.isEmpty());
	
	}
}
