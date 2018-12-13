package greensTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Firstname
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Test");
		//Surname
		WebElement surName=driver.findElement(By.xpath("//input[@name='lastname']"));
		surName.sendKeys("Test2");
		//Mobile number
		WebElement mobileNo=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobileNo.sendKeys("3425346363");
		//Password
		WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("oituyro");
		//Radio button
		WebElement radioButton=driver.findElement(By.xpath("//input[@name='sex' and @value=2]"));
		radioButton.click();
		//Submit button
		WebElement submitBtn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		submitBtn.click();
		driver.quit();
	}

}
