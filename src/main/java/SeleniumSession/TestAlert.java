package SeleniumSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestAlert {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		String url="https://mail.rediff.com/cgi-bin/login.cgi";

		By goBtn=By.name("proceed");
		
		driver=Util.launchBrowser(driver, "firefox");
		Util.launchURL(driver, url);
		System.out.println(Util.getPageTitle(driver));
		Util.clickOn(driver, goBtn);
		
		Thread.sleep(4000);
		
		String text=Util.getAlertText(driver);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct message");
		}
		else {
			System.out.println("in-correct message");
		}
		Util.closeBrowser(driver);
	}

}
