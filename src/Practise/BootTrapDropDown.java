package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootTrapDropDown {
	
	WebDriver driver ;

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
	
		
		WebElement allcat = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		selectfromdropdown(allcat,"Shoes & Handbags");
		
		WebElement country = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]"));
		selectfromdropdown(country,"Telugu");
		
	}
		public static void selectfromdropdown(WebElement ele,String u)
		{
			Select dro = new Select(ele);
			
			List<WebElement> drplist=dro.getOptions();
			
			for(WebElement drpbeauty:drplist)
			{
				if(drpbeauty.getText().equals("Beauty"))
				{
					drpbeauty.click();
					break;
				}
			}
		}

}



