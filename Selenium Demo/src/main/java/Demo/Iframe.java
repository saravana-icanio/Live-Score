package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		 
		//click
		driver.switchTo().frame(0);
		WebElement firstbutton = driver.findElement(By.xpath("//*[@id='Click']"));
		firstbutton.click();
		
		//get text
		String text = driver.findElement(By.xpath("//*[@id='Click']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
//		driver.switchTo().frame(1);
//		driver.switchTo().frame("frame2");
//		WebElement secondbutton = driver.findElement(By.xpath("//*[@id='Click']"));
//		secondbutton.click();
		
		//total count
	 List <WebElement>	total = driver.findElements(By.tagName("iframe"));
    int size = total.size();
    System.out.println(size);
	}
}