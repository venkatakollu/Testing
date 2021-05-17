package TestAutomation;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simpleclas {
	
	WebDriver driver ;

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenkatakrishnaraoKol\\eclipse-workspace\\TestAutomation\\src\\webdrivers\\chromedriver.exe");
	
	
  // String xPath_Today_ThisYear=	"//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.get("https://www.worldometers.info/world-population/");
		System.out.println(driver.getTitle());
		
		int i=1;
		
		while(i<10) {
			System.out.println(i + "sec");
			
			String maincount = driver.findElement(By.xpath("//*[@id=\"maincounter-wrap\"]/div/span")).getText();
			
			System.out.println("Current world population : "+maincount);
			
//			String today_births = driver.findElement(By.xpath("//div/span[@rel='births_today']")).getText();
//			System.out.println("Today's births is :"+today_births);
//			
//			String today_deaths = driver.findElement(By.xpath("//div/span[@rel='dth1s_today']")).getText();
//			System.out.println("Today's deaths is :"+today_deaths);
//			
//			String populationgroth = driver.findElement(By.xpath("//div/span[@rel='absolute_growth']")).getText();
//			System.out.println("Today's population growth is :"+populationgroth);
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			System.out.println("current time is "+timeStamp);
//			
//			String today_pop = driver.findElement(By.xpath("//*[contains(text(),'Today')]")).getText();
//			System.out.println("Today's births is :"+today_pop);
//			
//			String thiyear_pop = driver.findElement(By.xpath("//*[contains(text(),'This year')]")).getText();
//			System.out.println("Today's births is :"+thiyear_pop);
			Thread.sleep(1000);
			
			
			i++;
			//break;
			
		}
		 }
	
	
}
