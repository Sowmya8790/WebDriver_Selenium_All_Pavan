package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https:/www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement start = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println(start.getLocation()); //(59, 250)
		System.out.println(start.getSize());   //	(21, 21)
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(start, 200, 0).build().perform(); //only foe xoffset need to add the new value for y it should be 0
		
		System.out.println(start.getLocation()); //(260, 250)
		System.out.println(start.getSize());  //(21, 21)
			
		
		WebElement end = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println(end.getLocation());  //(412, 250)
		System.out.println(end.getSize());  //(21, 21)
		
		act.dragAndDropBy(end, -100, 0).build().perform();
		
		System.out.println(end.getLocation()); //(313, 250)
		System.out.println(end.getSize());  //(21, 21)
		
		

	}

}
