package SeleniumSession;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotConcept {
static WebDriver driver;
public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
	
	//lunch broowser
	driver=new ChromeDriver();
	//enter url
	driver.get("http://www.amazon.com");
	
}
public void screenShot() throws IOException{
	File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile, new File("/Users/user/Desktop/TestNG"));
}
}
