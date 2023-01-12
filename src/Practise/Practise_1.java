package Practise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practise_1 {

	public static void main(String[] args) {
		
		System.setProperty("Web DRiver.chrome.driver", "ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.get("https://demoqa.com/browser-windows");
		
		Set<Cookie> cokkies = driver.manage().getCookies();
		
		for(Cookie cokk:cokkies) {
			
			System.out.println(cokk.getName() + " " + cokk.getValue());
		}
		
		System.out.println(cokkies.size());
		
	    driver.manage().deleteCookieNamed("_ga");
	    
	    
	}

}
