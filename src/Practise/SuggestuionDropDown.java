package Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestuionDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("Webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement text = driver.findElement(By.xpath("//input[@id='sb_form_q']"));
		text.sendKeys("selenium");
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='sa_tm']/span"));
		System.out.println(elements.size());
		
	//	System.out.println(elements);
		
		for(WebElement select:elements) {
			
			if(select.getText().contains("download")) {
				select.click();
				break;
			}
		}
		
	
		

	}

}
