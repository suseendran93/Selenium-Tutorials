package greensTech;

import org.apache.log4j.net.SyslogAppender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParagraphContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement para = driver.findElement(By.xpath("//div[@id='article-wrapper']/p[4]"));
		String s = para.getText();
		driver.quit();
		System.out.println(s);
	}

}
