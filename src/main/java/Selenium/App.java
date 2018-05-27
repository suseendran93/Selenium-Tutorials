
package Selenium;

import org.openqa.selenium.WebDriver;

public class App {
	public static void main(String[] args) {
		// Login s1=new Login();

		System.out.println("Hello World! Thi is in Main class");

		Login obj = new Login();
		obj.login();
		obj.flights();
		obj.exit();

	}

}
