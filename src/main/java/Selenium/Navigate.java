package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//Navigate
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.flipkart.com/?affid=reviewser&affExtParam1=Google_search_wmnbvcxdfghjmjhgfdxcvredxc");
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}

}
