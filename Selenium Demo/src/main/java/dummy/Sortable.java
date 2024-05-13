package dummy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		 List<WebElement> element = driver.findElements(By.id("upload"));
		
		WebElement fromElement = element.get(6);
		WebElement toElement = element.get(0);
		
		Actions action = new Actions(driver);
		action.clickAndHold(fromElement);
		action.moveToElement(toElement);
		action.release(toElement);
		action.build().perform();

	}

}
