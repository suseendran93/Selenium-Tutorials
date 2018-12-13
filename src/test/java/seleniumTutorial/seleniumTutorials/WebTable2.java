package seleniumTutorial.seleniumTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable2 {
	static WebDriver driver;

	@BeforeMethod
	public void launcher() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		Thread.sleep(3000);
	}

	@Test
	public void getContents() {
		WebElement row = driver.findElement(By.xpath("//div[@class='ui-grid-canvas']/div"));
		//List<WebElement> rows = driver.findElements(
			//	By.xpath("//div[@ng-repeat='(rowRenderIndex, row) in rowContainer.renderedRows track by $index']"));

		List<WebElement> contents = row
				.findElements(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope']"));
		for (WebElement con : contents) {
			System.out.println(con.getText());
		}

	}

	@AfterMethod
	public void quit() {
		driver.quit();
		// }

	}
}
