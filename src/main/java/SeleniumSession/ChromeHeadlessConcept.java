package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessConcept {

	//without browser testing
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions cop=new ChromeOptions();
		cop.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(cop);
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
