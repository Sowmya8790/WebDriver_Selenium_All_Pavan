package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerEx2 {
	  WebDriver driver ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		WebElement cal = driver.findElement(By.xpath("//input[@class='thwcfe-checkout-date-picker input-text thwcfe-input-field hasDatepicker']"));
		cal.click();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	//	selectfromdropdown(month,"Jan");
		Select mo_se=new Select(month);
		mo_se.selectByVisibleText("Jan");
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		//	selectfromdropdown(month,"Jan");
			Select ye_se=new Select(year);
			ye_se.selectByVisibleText("2000");
			String day = "25";
	
		
		
	/*	public static void selectfromdropdown(WebElement ele,String u)
		{
			Select click_l = new Select(ele);
			
			List<WebElement> month_year = click_l.getOptions();
			
			for(WebElement m_y:month_year)
			{
				System.out.println(m_y.getText());
				if(m_y.getText().equals(u))
				{
					m_y.click();
				}
			}
		}*/
	
	List<WebElement> row = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr"));
	System.out.println(row.size());
	
	List<WebElement> col= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/th"));
	System.out.println(row.size());
	
	for(WebElement alldate:row)
	{
		List<WebElement> rowdate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
		for(WebElement selectrow: rowdate)
		{
			if(selectrow.getText().equals(day))
			{
				selectrow.click();
			}
		}
	}
	

	
	
	
	
		

	}

}
