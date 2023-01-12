package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerEx {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		WebElement cal = driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']"));
		cal.click();
		
		String yaer = "2023";
		String month = "July";
		String day = "25";
		
		while(true)
		{
			WebElement ymonth=driver.findElement(By.xpath("//td[@class='monthTitle']"));
			
			String arr[] = ymonth.getText().split(" ");
			
			String monthis =arr[0];
			String yearis= arr[1];
			
			if(month.equals(monthis) && yaer.equals(yearis))
				break;
			else
			{
				WebElement click = driver.findElement(By.xpath("//td[@class='next']"));
				click.click();
			}
			
			
		}
		
		List<WebElement> dates= driver.findElements(By.xpath("//tr[@class='rb-monthHeader']//following::tr/td"));
		
		for(WebElement dclick:dates)
		{			
			if(dclick.getText().equals(day))
			{
				dclick.click();
			}
			
				
		}
		
		
		
		
		
		
		
		
		

	}

}
