package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class TabandWindowURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "ChromeDr	iver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
	//	driver.switchTo().newWindow(WindowType.TAB);
		WebElement logo = driver.findElement(By.linkText("jQuery UI"));
		
		//to find location fo the obejct
		System.out.println(logo.getLocation());
		System.out.println("The x ordinate of the loaction : " +logo.getLocation().getX());
		System.out.println("The y ordinate of the loaction : " +logo.getLocation().getY());
		
		System.out.println("the location of logo  x using rect:" + logo.getRect().getX());
		System.out.println("the location of logo  y using rect:" + logo.getRect().getY());
		
		//to find the size means width and height of the element
		
		System.out.println("The size of the logo : "+logo.getSize());
		System.out.println("the height of the logo : " + logo.getSize().getHeight());
		System.out.println("the width of the logo : " + logo.getSize().getWidth());
		
		System.out.println("the height of the logo using rect : " + logo.getRect().getHeight());
		System.out.println("the width of the logo : " + logo.getRect().getWidth());
		

	}

}
