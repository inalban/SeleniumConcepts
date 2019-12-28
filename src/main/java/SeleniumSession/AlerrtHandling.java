package SeleniumSession;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerrtHandling {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		
	    driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		getAlertText();
		if (Util.getAlertText(driver).equals("Please enter a valid user name")) {
			System.out.println("Correct message");
			}
			else {
				System.out.println("incorrect message");
			}
		
		
		
		
		
//		Alert alert=driver.switchTo().alert();//Alert interface is used to handle alert in web
//		 									//dismis()   accept()   getText()  sendKeys()
//		String text=alert.getText();
//		System.out.println(text);
//		
//		if (text.equals("Please enter a valid user name")) {
//			System.out.println("Correct message");
//		}
//		else {
//			System.out.println("incorrect message");
//		}
//		
//		//alert.accept();//click on the ok button in the alert
//		
//		alert.dismiss();//cancell the alert
		
	}
public static String getAlertText(){
	Alert alert=driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
	alert.accept();
	return text;
}
}
