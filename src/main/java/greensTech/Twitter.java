	package greensTech;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Twitter {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssndr\\Documents\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://twitter.com/");
			driver.findElement(By.xpath("(//input[@autocomplete='username'])[1]")).sendKeys("2343424");
			driver.findElement(By.xpath("(//input[@autocomplete='current-password'])[1]")).sendKeys("fsfsfs");
			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		}
	
	}
