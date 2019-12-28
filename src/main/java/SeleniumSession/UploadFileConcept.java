package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileConcept {
	//Jakop API
	//AutoIT
	//we can use webelement sendKeys()  so we define files path
		static WebDriver driver;

		public static void main(String[] args) {
		

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
			
			driver.findElement(By.name("upfile")).sendKeys("Users/user/Desktop/takip.xlsx");
}
}