package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertlearn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		//Click ok
		WebElement Alert = driver.findElement(By.id("j_idt88:j_idt91"));
		Alert.click();
		Alert control = driver.switchTo().alert();
		control.accept();
		
		//Click cancel
		WebElement cancel = driver.findElement(By.id("j_idt88:j_idt93"));
		cancel.click();
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();

		//Click and enter
		WebElement prompt = driver.findElement(By.id("j_idt88:j_idt104"));
		prompt.click();

		Alert enter = driver.switchTo().alert();
		enter.sendKeys("Well Done");
		enter.accept();

	}
}