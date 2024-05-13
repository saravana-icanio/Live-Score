package Demo;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		//get position
		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));  
		org.openqa.selenium.Point xypoint = position.getLocation();
		int step1 = xypoint.getX();
		int step2 = xypoint.getY();
		System.out.println("X Value is :"+step1+"Y Value is :"+step2);
		
		//get color
		WebElement Color = driver.findElement(By.id("j_idt88:j_idt96"));
		String collect = Color.getCssValue("background");
		System.out.println("Button collor is :"+collect);
		
		//get height and width
		WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
		int tall = size.getSize().getHeight();
		int fat = size.getSize().getWidth();
		System.out.println("Height is :"+tall+" Width is :"+fat);
		
		//go to home page
		WebElement go = driver.findElement(By.id("j_idt88:j_idt90"));
		go.click();

	}

}
