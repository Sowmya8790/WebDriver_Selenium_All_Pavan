package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_today {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement name= driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Sowmya");
		
		WebElement phone= driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("9014412625");
		
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("9014412625");
		
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Sowmya@123");
		
		WebElement address= driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("Welcome to the world");
		
		WebElement Gender = driver.findElement(By.xpath("//label[text()='Gender']"));
		
		String GenderSelect = "female";
		
		String Xpath = "//label[@class='form-check-label']//input[@id='" +GenderSelect+"']";
			
		WebElement xpa=driver.findElement(By.xpath(Xpath));
		xpa.click();
		
	
		WebElement Day = driver.findElement(By.xpath("//label[text()='Which days of the week are best to start something new?']"));
		
		List<WebElement> days =driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));
		
		//Select all days
		
	/*	for(WebElement ele:days)
		{
			ele.click();
		}*/
		
		//select last 2 days
		
	/*	int daysize =days.size();
		
		System.out.println(daysize);
		
		for(int i=daysize-2;i<daysize;i++)
		{
			days.get(i).click();
		}*/
		
		//select 1st two days
		
		for(int i=0;i<days.size();i++)
		{
			if(i<2)
			{
				days.get(i).click();
			}
		}
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select drop=new Select(dropdown);
		
		String select = "Norway";
		
		List<WebElement> dropele = driver.findElements(By.xpath("//select[@class='custom-select']/option"));
		
		String Xpaths= "//select[@class='custom-select']/option[text()='" +select+ "']";
		
		WebElement dropselect =driver.findElement(By.xpath(Xpaths));
		dropselect.click();
		
	//	WebElement experience = driver.findElement(By.xpath("//label[text()='Years of experience in test automation']"));
		
		List<WebElement> yearexp = driver.findElements(By.xpath("//label[@class='custom-control-label' and contains(@for,'year')]"));
		String years ="4years";
		String Xpathyearexp = "//label[@class='custom-control-label' and contains(@for,'" +years+ "')]";
		
		WebElement yearexpr=driver.findElement(By.xpath(Xpathyearexp));

		yearexpr.click();
		
		WebElement autotool=driver.findElement(By.xpath("//label[text()='Which automation tools/frameworks do you use?']"));
		
		List<WebElement> tools = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox']//following::label[@class='custom-control-label']"));
				
		
	/*	for(WebElement tool:tools)
		{
			System.out.println(tool.getAttribute("for"));
			
			if(tool.getAttribute("for").equals("serenity"))
			{
				tool.click();
				
			}
		}*/
		
	/*	for(WebElement tool:tools)
		{
			
				tool.click();
		}*/
		
		for(WebElement tool:tools)
		{
			if(tool.getAttribute("for").equals("selenium")|| tool.getAttribute("for").equals("serenity"))
			
			{
				tool.click();
				
			}
		}
				
		
		
		
	}

}
