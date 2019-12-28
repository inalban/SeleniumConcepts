package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderConcept {
	static WebDriver driver;

	public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://rangeslider.js.org/");

		WebElement slider =driver.findElement(By.xpath("//div[@id='js-rangeslider-0']//div[@class='rangeslider__handle']"));
		WebElement element = driver.findElement(By.id("js-rangeslider-0"));
		
		//How to find dimension
	Dimension dim=element.getSize(); //it gives axis
	System.out.println(dim);
	
	Actions actions=new Actions(driver);
	actions.dragAndDropBy(slider, -100, 0).perform();
	//2. way
	//actions.clickAndHold(slider).moveByOffset(40, 0).release().perform();
	
	
	}
	
}
