package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertUtilUsage {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		By goBtn=By.name("proceed");
		

		driver=Util.launchBrowser(driver, "Chrome");
		Util.launchURL(driver, url);
		
		String text=Util.getAlertText(driver);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct message");
		}
		else {
			System.out.println("in-correct message");
		}
		Util.closeBrowser(driver);
		
		//How to handle Pop up alert
		//Alert alert=driver.switchTo().alert();
		//alert.accept()
		//alert.dismiss()
		//alert.sendKeys(keysToSend)
		//alert.getText
		
	}

}
