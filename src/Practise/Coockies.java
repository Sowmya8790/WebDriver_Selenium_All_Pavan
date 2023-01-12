package Practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coockies {

	public static void main(String[] args) {
		
				//How to capture cookies from browser?
			//	How to print cookies from browser?
			//	How to add Cookie to the browser?
			//	How to delete Specific Cookie from the browser?
			//	How to delete all cookies from the browser?

		//How to capture cookies from browser?
		System.setProperty("WebDriver.chrome.driver", "ChromeDr	iver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to find and print all the cookies inthe page
		driver.get("https://demoqa.com/browser-windows");
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
		//How to print cookies from browser?
		for(Cookie cokki:cookies) {
			System.out.println(cokki.getName() +" : "+ cokki.getValue());
		}
		
		//How to delete Specific Cookie from the browser?
		driver.manage().deleteCookieNamed("ga");
		
		
		System.out.println("The size is :" +cookies.size());
		
		//	How to add Cookie to the browser?
		Cookie cookobj = new Cookie("tinni12345", "123456789");
		driver.manage().addCookie(cookobj);
		
		System.out.println(driver.manage().getCookies().size());
		
		//How to delete Specific Cookie from the browser?
		
	/*	driver.manage().deleteCookie(cookobj);
		System.out.println(driver.manage().getCookies().size());*/
		
		//How to delete all cookies from the browser?
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies().size());
	}

}
