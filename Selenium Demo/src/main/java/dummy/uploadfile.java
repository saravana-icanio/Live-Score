package dummy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opera.core.systems.internal.input.KeyEvent;

public class uploadfile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement upload = driver.findElement(By.id("upload"));
		upload.click();
		String file = "/home/icanio-10109/Downloads";
		
		StringSelection Select = new StringSelection(file);
				
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Select, null);
		
		Robot selenium = new Robot();
		selenium.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		selenium.keyPress(java.awt.event.KeyEvent.VK_V);
		selenium.keyRelease(java.awt.event.KeyEvent.VK_V);
		selenium.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		selenium.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		selenium.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		
	}
}