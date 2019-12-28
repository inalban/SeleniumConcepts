package SeleniumSession;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLUnitDriverHeadless {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
				

	}

}
