package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement index = driver.findElement(By.className("ui-selectonemenu"));
		Select Value = new Select(index);	 
		Value.selectByIndex(2);
		
		WebElement Country = driver.findElement(By.id("j_idt87:country_label"));
	     Country.click();
						
		List<WebElement> dropdown = Value.getOptions();
		int count = dropdown.size();
		System.out.println(count);

	}

}
