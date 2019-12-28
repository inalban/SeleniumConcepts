package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		/*
		//1. locator-ID
		
		WebElement userElement=driver.findElement(By.id("username"));
		userElement.sendKeys("ilhanturkmen@hotmail.com");
		//second way
		//driver.findElement(By.id("username")).userElement.sendKeys("ilhanturkmen@hotmail.com");
		//thirth way
		//By username=By.id("username");
		//Util.getElement(driver,username).sendKeys("ilhanturkmen@hotmail.com");
		//Forth way
		//By username=By.id("username");
		//WebElement userElement=driver.findElement(username);
		//userElement.sendKeys("ilhanturkmen@hotmail.com");
		
		WebElement passwordElement=driver.findElement(By.id("password"));
		passwordElement.sendKeys("123@test");
		
		By login=By.id("loginBtn");
		Util.getElement(driver, login).click();
		
		//2. locator-NAME
		
		driver.findElement(By.name("username")).sendKeys("test@test.net");
		
		//professional usage
		//By username=By.name("username");
		//Util.getElement(driver, username).sendKeys("test@test.net");
		
		//3. locator-XPATH
		//1. usage
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ilhanturkmen@hotmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@id='loginBtn']"));
		
		//2. usage
		WebElement element=driver.findElement(By.xpath("//input[@id='username']"));
		element.sendKeys("ilhanturkmen@hotmail.com");
		WebElement element1=driver.findElement(By.xpath("//input[@id='username']"));
		element1.sendKeys("abc123");
		
		//3. usage
		By username =By.xpath("//input[@id='username']");
		Util.getElement(driver, username).sendKeys("ilhanturkmen@hotmail.com");
		
		//4. locator- CSS 
		//1. usage
		driver.findElement(By.cssSelector("#username")).sendKeys("ilhanturkmen@hotmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("abc123");
		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		//2. usage
		WebElement element2=driver.findElement(By.cssSelector("#username"));
		element2.sendKeys("ilhanturkmen@hotmail.com");
		
		//3. usage
		By username2=By.cssSelector("#username");
		Util.getElement(driver, username2);
		
		//5. locator CLASS
		By username3=By.className("login-email");
		Util.getElement(driver, username3).sendKeys("ilhanturkmen@hotmail.com");
		
		
		//6. locator LINKTEXT
		By signUpLink=By.linkText("Sign up");
		Util.getElement(driver, signUpLink).click();
	*/	
		//7. PORTIAL LINK
		By usignUpPortalLink=By.linkText("Sign");
		Util.getElement(driver, usignUpPortalLink).click();
		
		
	}

}
