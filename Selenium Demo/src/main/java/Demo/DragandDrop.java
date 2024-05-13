package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		
		WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement to = driver.findElement(By.id("form:drop_content"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(from, to).build().perform();

	}

}
