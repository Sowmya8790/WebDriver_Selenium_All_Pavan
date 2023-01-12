package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DortedDropDown {

	public static void main(String[] args) {
		
		//logic crate a original and duplicate list of drop drown and sort the duplicate list then equa the original and duplicate.
		
		System.setProperty("Webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement drop = driver.findElement(By.xpath("//p/select"));
		
		Select dropdown= new Select(drop);
		List<WebElement> country = dropdown.getOptions();
		
		ArrayList original = new ArrayList();
		ArrayList temp = new ArrayList();
		
		for(WebElement cou:country) {
			original.add(cou.getText());
			temp.add(cou.getText());			
			
		}
		
		System.out.println("The original dropdown" +original);
		
		Collections.sort(temp);
		
		// Arrays.sort(temp, Collections.reverseOrder());	
		
		System.out.println("the changed list" +temp);
		
		if(original.equals(temp)) {
			
			System.out.println("This sorted");
		}else
		{
			System.out.println("not sorted");
		}
		

	}

}
