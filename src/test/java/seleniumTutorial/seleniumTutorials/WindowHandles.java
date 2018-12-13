package seleniumTutorial.seleniumTutorials;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();

		Set<String> handles = driver.getWindowHandles();

		List<String> list = new LinkedList<>();
		list.addAll(handles);

		for (int i = 0; i < list.size(); i++) {
			// System.out.println(list.get(i));
			driver.switchTo().window(list.get(i));
			System.out.println(driver.getTitle());

			try {
				WebElement element = driver.findElement(By.xpath("//body[contains(text(),'Knowledge')]"));

				if (element.isDisplayed()) {

					//System.out.println("Displayed");
					System.out.println(element.getText());
					
				}
			} catch (Exception e) {

				System.out.println("No such element found");
				driver.switchTo().window(list.get(i)).close();
				continue;
			}
		}
		driver.quit();
	}

}
