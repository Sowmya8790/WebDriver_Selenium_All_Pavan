package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery {
	


	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
	  //  selectchoicevalues(driver,"choice 1");
	//	selectchoicevalues(driver,"choice 1", "choice 2");
		selectchoicevalues(driver,"all");
		
		 

	}
	
	private static void selectchoicevalues(WebDriver driver, String... value) {
		// TODO Auto-generated method stub
		
List<WebElement> choicelist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choicelist)
			{
				String text = item.getText();
				
				for(String val:value)
				{
					if(text.equals(val))
					{
						item.click();
						break;
					}
				}
			}
		}
		//ElementNotInteractableException:
		else {
			try {
				for(WebElement item: choicelist)
				{
					item.click();
				}
				
			}
			catch(Exception e)
			{
				
			}
			
		}
	}
		
	}


		


