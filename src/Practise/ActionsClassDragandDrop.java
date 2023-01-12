package Practise;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ActionsClassDragandDrop {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement rigt = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		
		act.contextClick(rigt).build().perform();*/
		
	/*	
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement doubleclicks = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		

		Actions act = new Actions(driver);
		act.doubleClick(doubleclicks).build().perform();
		
		driver.close();*/
		
		//drag from one place and drop to another need to identify the pathof of both target and source
		
/*		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='countries']"));
		
	Actions act = new Actions(driver);
	act.dragAndDrop(oslo, drop).build().perform();
	
	driver.close();*/
		
		
		//drag and drop for the pictures.
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement Pic1 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(Pic1, target).build().perform();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		WebElement findele = driver.findElement(By.xpath("//span[text()='Select Elements']"));
		findele.click();
		
		
		
		List<WebElement> items = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		for(WebElement select:items) {
			
			act.keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL);
		}
		
		//Mouse hover action can be done need to fif the elemet where need to hover and then select the object from dropdown and select that.
		
		
	/*	driver.get("https://demo.opencart.com/");
		driver.manage().window();
		
		WebElement desk = driver.findElement(By.xpath("//a[text()='Desktops']"));
	
		WebElement mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(desk).moveToElement(mac).click().build().perform();*/
		
		
	
		
	}
		
		
	
}
