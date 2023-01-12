package Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//windowhandle
		driver.get("https://opensource-demo.orangehrmlive.com/");
	//	System.out.println(driver.getWindowHandle());
		
		//windowhandels
		WebElement clicklink = driver.findElement(By.xpath("//a[text(),'OrangeHRM, Inc']"));
		clicklink.click();
		Set<String> windowids = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList( windowids);
		
	/*	Iterator winid=windowids.iterator();
		
			System.out.println("The parent window id : " +winid.next());
			System.out.println("The child window id :" +winid.next());
			*/
		
		
	/*	for(String id:windowlist)
		{
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
		}*/
		
		// method 2 using arraylis
	/*List<String> id = new ArrayList(ids);
		
		String parentwin = id.get(0);
		String childwin = id.get(1);*/
		
	  //  driver.close();
		
		//in order to select any partticular tab have to know the title of the page.

		for(String id:windowlist)
		{
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
		}
		

	}

}
