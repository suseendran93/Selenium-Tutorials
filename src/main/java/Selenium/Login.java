package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Login {
	public WebDriver driver;

	public void login() {

		System.setProperty("webdriver.chrome.driver", "/home/susee/eclipse-workspace/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suseendran");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("suseendran");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Login validation
		String successlogin = driver.findElement(By.xpath("//*[contains(text(),'Loggin')]")).getText();

		String validateLogin = "Thank you for Loggin.";

		if (successlogin.equals(validateLogin)) {

			System.out.println("Successfully logged in");

		}
		// Screenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("/home/susee/eclipse-workspace/Screenshots/Screenshot.png");
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			System.out.println("Screenshot not taken");
			e.printStackTrace();
		}
		System.out.println("Screenshot taken");

	}

	public void flights() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		System.out.println("Flights success");
		driver.findElement(By.xpath("//input[@value='roundtrip']"));
	}

	public void exit() {
		driver.close();
	}
}
