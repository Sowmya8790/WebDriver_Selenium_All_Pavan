package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopupNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Some time after opening the link it shows somg notifications like aloww/bloack audio/location/video.
		
		System.setProperty("WebDriver.Chrome.driver", "ChromeDriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); //if its firefox give firefoxoptions
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://www.redbus.in/");
		

	}

}
