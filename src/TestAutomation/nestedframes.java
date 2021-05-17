package TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenkatakrishnaraoKol\\eclipse-workspace\\TestAutomation\\src\\webdrivers\\chromedriver.exe");
		
		
		 
				WebDriver driver  = new ChromeDriver();
				
				driver.get("https://the-internet.herokuapp.com/nested_frames");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				
				System.out.println(driver.findElements(By.tagName("frameset")).size());
				driver.switchTo().frame(0);
			System.out.println(driver.findElements(By.tagName("frameset")).size());
		
			driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
			
		//	driver.findElement(By.id("content")).getText();
			
			System.out.println(driver.findElement(By.id("content")).getText());
			driver.switchTo().defaultContent();
			
			
		
	}

}
