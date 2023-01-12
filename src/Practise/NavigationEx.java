package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		System.out.println(driver.getTitle()); //Simplilearn page
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/s?"); //amazon page
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle()); //goes back to simplilearn 
		
		driver.navigate().forward();
		System.out.println(driver.getTitle()); //goes forward to amazon
		
		driver.navigate().refresh(); //refresh the tab
		
		driver.close(); //as all url open in single window
		
	}

}
