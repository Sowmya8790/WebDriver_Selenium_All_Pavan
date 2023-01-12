package Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	private static final By By = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");
		
		WebDriver drive=new ChromeDriver();
		
		drive.get("https://www.simplilearn.com/");
		
		drive.findElement(By.className("login")).click();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement login = drive.findElement(By.name("user_login"));
		login.sendKeys("Sowmi3v@gmail.com");
		
		drive.findElement(By.name("user_pwd")).sendKeys("Sowyua@123");
		drive.findElement(By.className("rememberMe")).click();
		drive.findElement(By.name("btn_login")).click();
		
		WebElement error= drive.findElement(By.id("msg_box"));
		String s = error.getText();
		String n ="The email or password you have entered is valid.";
		
		if(s.equals(n))
		{
			System.out.println("The test is passed");
		}
		else {
			System.out.println("The test is failed");
		}
		
		List<WebElement> Links = drive.findElements(By.tagName("a"));
		System.out.println("Total no of links are " +Links.size());
		
		for(int i =0;i<Links.size();i++)
		{
			System.out.println(Links.get(i).getAttribute("href"));  //href is anchor Tag.
		}
		
		
		
		drive.close();
		
		

	}

}
