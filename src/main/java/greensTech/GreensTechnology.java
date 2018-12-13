package greensTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		driver.findElement(By.xpath("//a[text()='COURSES']")).click();
		driver.findElement(By.xpath("//a[@href='selenium-course-content.html']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'BNP Paribas')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='interview']//button[text()='Close']")).click();
		driver.quit();
	}

}
