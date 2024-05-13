package dummy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.seleniumemulation.GetAttributeFromAllWindows;

public class Autocompletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement Daily = driver.findElement(By.id("tag"));
		Daily.sendKeys("S");
		
		List<WebElement> option = driver.findElements(By.xpath("//*[@id='j_idt87:console2']/tbody/tr/td[1]/div/div[2]/li"));
	   
		System.out.println(option.size());
		
		for (WebElement webElement : option) {
			if(webElement.getText().equals("Selenium"));
			  webElement.click();
			  System.out.println("if else");
			  break;
		}	
		//else
		{
				  System.out.println("else part");
			  }
			
	}
	}