package seleniumTutorial.seleniumTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> tableHeading = driver.findElements(By.xpath("//tbody/tr/th"));
		for (WebElement th : tableHeading) {
			System.out.println(th.getText()+"\t");
			
		}
		List<WebElement> tableRows = driver.findElements(By.xpath("//tbody/tr"));

		for (WebElement tr : tableRows) {
			System.out.println();
			List<WebElement> tableColumns = tr.findElements(By.tagName("td"));
			for (WebElement tc : tableColumns) {
				System.out.print(tc.getText() + "\t");
			}
		
		}
		driver.quit();
	}

}