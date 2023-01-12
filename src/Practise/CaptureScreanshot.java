package Practise;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaptureScreanshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement women =driver.findElement(By.xpath("//a[text()='Women']"));
		
		//To capture full screanshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE); // name of the image and format
		File trg = new File(".//Screenshots/homepage.png"); //Location where to save
		FileUtils.copyFile(src,trg); // need to save the Src to the target.
		
		//To capture a particular feature
		
	/*	WebElement feature = driver.findElement(By.xpath("//div[@class='columns-container']"));
		File src = feature.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//Screenshots/feature.png");
		FileUtils.copyFile(src, trg);*/
		
		//To capture particular element
		
	/*	WebElement element =driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File Trg = new File(".//Screenshots/element.png");
		FileUtils.copyFile(src, Trg);*/
		
/*		public void getscreenshot(WebDriver driver,String screenshotName) {
			
			String datename = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
			TakesScreenshot tsobj =  (TakesScreenshot) driver;
			File file = tsobj.getScreenshotAs(OutputType.FILE);
			
			//after execution you could see a folder "failed test screenshots under src folder.
			
			String destination = System.getProperty("C:\\Users\\vsowmyasri\\eclipse-workspace\\Selenium_Maven") + "/Screenshots/" + screenshotName + datename + ".png";


				}*/
					

		
		

	}

}
