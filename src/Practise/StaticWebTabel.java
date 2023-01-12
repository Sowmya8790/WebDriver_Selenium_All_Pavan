package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTabel {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		  
		//to find the size of the rows
		List<WebElement> rows= driver.findElements(By.xpath("//tbody/tr"));
		System.out.println(rows.size());
		
		
		//all columns //tbody/tr/th
		List<WebElement> columns= driver.findElements(By.xpath("//tbody/tr/th"));
		System.out.println(columns.size());
		
		//to retive particular path. learn java
		
		WebElement javapath = driver.findElement(By.xpath("//tbody/tr[3]/td[1]"));
		System.out.println(javapath.getText());
		
		for(WebElement alldata:rows)
		{
			List<WebElement> allcell = alldata.findElements(By.tagName("td"));
			
			for(WebElement all:allcell)
			{
				System.out.println(all.getText());
			}
			System.out.println();
			
			
		}
		
		for(int row=1;row<=rows.size();row++)
		{
			for(int col=1;col<=columns.size();col++)
			{
				String data = driver.findElement(By.xpath("//tbody/tr["+row+"]/*["+col+"]")).getText();
				System.out.println(data);
			}
			System.out.println();
		}
		
		//to get any particular column in row.
		for(int r=1;r<=rows.size();r++)
		{
			String dataa = driver.findElement(By.xpath("//tbody/tr["+r+"]/*[2]")).getText();
			System.out.println(dataa);
		}

	}

}
