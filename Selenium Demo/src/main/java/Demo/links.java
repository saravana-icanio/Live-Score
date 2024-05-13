package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		//go to home
		WebElement link =driver.findElement(By.partialLinkText("Go to Dashboard"));
		link.click();		
		driver.navigate().back();
		
//		//Without click link but identify
		WebElement where =driver.findElement(By.partialLinkText("Find the URL"));
	    String notclick = where.getAttribute("href");
	    System.out.println("wher is "+notclick);
	    
	    //broken or not
	    WebElement broken =driver.findElement(By.linkText("Broken?"));
	    broken.click();    
	    String not = driver.getTitle();
		if(not.contains("404")) {
	    	System.out.println("Link is broken");
	    }
        driver.navigate().back();
//        
//        
		WebElement link1 =driver.findElement(By.partialLinkText("Go to Dashboard"));
	    link1.click();
	    driver.navigate().back();	    
	  
	    List<WebElement> Run = driver.findElements(By.tagName("href"));
	  int Done = Run.size();
	    
	  System.out.println("Link count "+Done);
	    
	}
}