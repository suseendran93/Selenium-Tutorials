package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSelectText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i phone x plus");
		driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']")).click();
		Thread.sleep(2000);
		WebElement price=driver.findElement(By.xpath("//span[text()='98,999']"));
		String s=price.getText();
		System.out.println(s);
		
		driver.findElement(By.xpath("//h2[text()='Apple iPhone X (Space Grey, 256GB)']")).click();
		
		driver.quit();
	}

}
