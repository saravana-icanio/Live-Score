package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		//add
	   WebElement enter =driver.findElement(By.name("j_idt88:name")); 
	   enter.sendKeys("perumal.d@icanio.com");
	 
	   //edit
	   WebElement edit =driver.findElement(By.name("j_idt88:j_idt91"));
	   edit.sendKeys(" Dhawan");
	    
	   //clear
       WebElement remove =driver.findElement(By.name("j_idt88:j_idt95")); 
       remove.clear();
       
       //same value print 
       WebElement get = driver.findElement(By.name("j_idt88:j_idt97"));
       String Getting = get.getAttribute("value"); 
       System.out.println(Getting);
       
       //diabled true or disable false
       WebElement truecall = driver.findElement(By.name("j_idt88:j_idt97"));
       boolean enabled = truecall.isEnabled();
       System.out.println(enabled);
       
       

	}
}