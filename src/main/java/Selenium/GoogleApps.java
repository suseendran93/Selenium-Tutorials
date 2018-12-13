package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		
		WebElement wb=driver.findElement(By.xpath("//li[@class='gb_Z']/a[@id='gb23']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(wb).perform();
		acc.click(wb).perform();
		
		driver.quit();
		
		
	}

}
