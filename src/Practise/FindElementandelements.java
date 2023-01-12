package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementandelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		driver.findElement(By.className("courses-menu"));
		WebElement all = driver.findElement(By.tagName("a"));
		System.out.println(all.getText());
		
		//finelements
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
	/*	for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}*/
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}

	}

}
