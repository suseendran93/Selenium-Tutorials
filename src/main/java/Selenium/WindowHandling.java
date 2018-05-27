package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		String ParentWindowId=it.next();
		System.out.println(ParentWindowId);
		
		String PopupWindowId=it.next();//This is shift window handle to next window i.e pop up window
		System.out.println(PopupWindowId);
		
		driver.switchTo().window(PopupWindowId);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();//Closes pop up
		driver.switchTo().window(ParentWindowId);
		driver.close();//Closes parent window
	}

}
