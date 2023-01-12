package Practise;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DownloadFile {

	public static void main(String[] args) {
		
		//chrome
		
		String location = System.getProperty("user.dir")+"\\Downloads\\";
		
		HashMap preference= new HashMap();
		preference.put("downloads.default_directory", preference);
		
		ChromeOptions option = new ChromeOptions();
	//	option.addArguments("--disabale-notifications");
		option.setExperimentalOption("prefs",preference);
		
		
		
		System.setProperty("Webdriver.chrome.driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver(option);
		
	    driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/\r\n");
	    driver.manage().window().maximize();
	    
	 /*   Actions act = new Actions(driver);
	    act.sendKeys(Keys.ARROW_DOWN).perform();*/
	    
	    WebElement download = driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a"));
	    
	    JavascriptExecutor obj = (JavascriptExecutor) driver;
		
		obj.executeScript("arguments[0].scrollIntoView();", download);
	    
	
	   download.click();
	}


	}

