package dummy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		//action go to new window
		String open = driver.getWindowHandle();
		WebElement firstbutton = driver.findElement(By.id("j_idt88:new"));
		firstbutton.click();
		
		         Set<String> handles = driver.getWindowHandles();
		         for(String newWindow: handles) {
			     driver.switchTo().window(newWindow);
		}
		
		WebElement edit = driver.findElement(By.xpath("//*[@id='email']"));
		edit.click();
		driver.close();
		
		//Number of window count
		driver.switchTo().window(open);
		WebElement multiple = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
		multiple.click();                         
		
		int numberofwindow = driver.getWindowHandles().size();
		System.out.println("Number of window opened:"+numberofwindow);

		//old window only open other all window will be closed
		WebElement closed = driver.findElement(By.id("j_idt88:j_idt93"));
		closed.click();
		
		         Set<String> newhandler = driver.getWindowHandles();
		        for (String allwindows : newhandler) {	
			     if(!allwindows.equals(open)) {
		driver.switchTo().window(allwindows);
		driver.close();
			}
		}
		driver.quit();
	}
}