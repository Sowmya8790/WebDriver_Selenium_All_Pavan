package Practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class ToolTipAndMultipleTabsWnds {

	public static void main(String[] args) {
			
		System.setProperty("WebDriver.chrome.driver", "ChromeDRiver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		// to print the tooltip
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
		System.out.println(inputbox.getAttribute("title"));
		
		//how to open link in new tab
		driver.switchTo().defaultContent();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		String clicks = Keys.chord(Keys.CONTROL,Keys.ENTER);
		WebElement register = driver.findElement(By.linkText("Support"));
		register.sendKeys(clicks);
		
	/*	System.out.println(driver.getWindowHandles());
		Set<String> ids = driver.getWindowHandles();
		
		List<String> id = new ArrayList(ids);
		
		String parentwin = id.get(0);
		String childwin = id.get(1);
		
		driver.switchTo().window(childwin);
		System.out.println(driver.getTitle());*/
		
		
	
	

	}

}
