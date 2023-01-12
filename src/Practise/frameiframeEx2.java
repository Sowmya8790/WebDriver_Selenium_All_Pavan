package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameiframeEx2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drive","chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.switchTo().frame("frame1");
		
		WebElement Header = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		driver.switchTo().frame(Header);
		
		WebElement input = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		input.sendKeys("welcome");

	}

}
