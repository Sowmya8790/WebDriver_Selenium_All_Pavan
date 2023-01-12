package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {
	
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
	
		System.setProperty("WebDriver.chrome.driver","chromeDriver.exe");
		
		
		driver.get("https://www.amazon.in/?");
		
	/*	WebElement dropdownele = driver.findElement(By.id("searchDropdownBox"));
		
		//create a clss for select 
		
		Select dropdown = new Select(dropdownele);
		
		dropdown.selectByVisibleText("Beauty");
		dropdown.selectByValue("search-alias=beauty");
		dropdown.selectByIndex(7);*/
		
		//Selecting option from dropdown without using methods.
		
		WebElement optionsele = driver.findElement(By.id("searchDropdownBox"));
		
		Select options = new Select(optionsele);
		
		List<WebElement> opt =options.getOptions();
		
		for(WebElement optt: opt)
		{
			if(optt.getText().equals("Beauty"))
			{
				optt.click();
				break;
			}
		
		}
	}
}
	
		
	

	


