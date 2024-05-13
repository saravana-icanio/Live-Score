package dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement broken = driver.findElement(By.id("images"));
		
		if(broken.getAttribute("naturalWidth").equals(0)) {
		System.out.println("It is a broken");
		}
		else {
			System.out.println("not a broken");
		}

	}

}
