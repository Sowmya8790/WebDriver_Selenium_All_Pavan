package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) {
		
		//select specific check box
		
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//selet all the check boxes.
		
		List<WebElement> days = driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,'day')]"));
		
	/*	for(WebElement day:days)
		{
			day.click();
		}*/
		
		//Select practicular checkboxes
		
	/*	for(WebElement day:days)
		{
			String today = day.getAttribute("id");
			if(today.equals("monday") || today.equals("sunday"))
			{
				day.click();
			}
			
		}*/
		
		// Selecet last 2 check boxes.
		
	/*	int totalcheckboxes = days.size();
		for(int i =totalcheckboxes-2;i<totalcheckboxes;i++)
		{
			days.get(i).click();
		}*/
		
		// Select last 2 check boxes.
		
		
	}

}
