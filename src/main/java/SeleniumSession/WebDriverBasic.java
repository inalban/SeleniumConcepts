package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		
		//lunch broowser
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("http://www.google.com");
		
		//get title
		String title=driver.getTitle();
		System.out.println("Page title is "+title);
		
		//validation
		if (title.equals("Google")) {
			System.out.println("Correct title");
		}else {
			System.out.println("Incorrect title");
		}
		
		//get current url
		System.out.println("Current url: "+driver.getCurrentUrl());
	
		//Page source
		//System.out.println(driver.getPageSource());
		
		//Slow down
		Thread.sleep(5000);//it will wait 5 seconds
		
		
		//close browser
		driver.quit();//close all of the windows on the browser
		//driver.close(); //close only last window on the browser
		
		
		
	}

}
