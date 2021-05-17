package TestAutomation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class challeng2 {
	WebDriver driver;


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenkatakrishnaraoKol\\eclipse-workspace\\TestAutomation\\src\\webdrivers\\chromedriver.exe");
       WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.noon.com/uae-en/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
	String text1 = driver.findElement(By.xpath("//h3[contains(text(),'Recommended For You')]")).getText();
	System.out.println(text1);
	
	int count = driver.findElements(By.xpath("//div[@class='e3js0d-11 liZdac']")).size();
	System.out.println(count);
	
	//WebElement list = count.driver.findElements(By.xpath("//div[@class='e3js0d-11 liZdac']");
	
	
	List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='e3js0d-11 liZdac']"));
	
	for(int i =1; i<=count; i++) {
		
		//\U000dallLinks.getClass();
		
		System.out.println(allLinks.get(i).getText());
	
	
	
	
	//String BY_ID = "//body/div[@id='__next']/div[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]";
	
//	driver.findElement(By.xpath(BY_ID)).click();


	
	}}}

	




