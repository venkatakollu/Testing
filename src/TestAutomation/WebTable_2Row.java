package TestAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_2Row {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VenkatakrishnaraoKol\\eclipse-workspace\\TestAutomation\\src\\webdrivers\\chromedriver.exe");
	
	 
	WebDriver driver  = new ChromeDriver();
	
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();

	
	//By webTable_Name = By.xpath("//table[@name='courses']");
	
	WebElement webTable = driver.findElement(By.xpath("//table[@name='courses']"));
	
	//int webTableRow = webTable.findElements(By.tagName("tr")).size();
	
	//System.out.println("No of rows "+ webTableRow);
	
	List<WebElement> row = webTable.findElements(By.tagName("tr"));
	
	//int webTableColumn = row.findElements(By.tagName("td")).size();
	
	
	//System.out.println("No of columns "+ webTableColumn);
	
	List<WebElement> cList = webTable.findElements(By.tagName("td"));
	
	
	//System.out.println("Column cunt" + cCount);
    
	//System.out.println(row.get(2).getText()); 
	
	
	
		
	
		//System.out.println(rowlist.getSize());
	
		//System.out.println(row.get(i).getText()); 
		
		for(WebElement Column : cList ) {
			
			
			System.out.print(Column.getText());
			
		
		
		
	}
	
}
}