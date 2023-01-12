package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//make into headless browser
		ChromeOptions options= new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.simplilearn.com/");
		System.out.println(driver.getTitle());
		
		

	}

}

