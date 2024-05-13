package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		//click
		WebElement check = driver.findElement(By.xpath("//*[@id='j_idt87:basic']/tbody/tr/td[1]/div/div[2]"));
		check.click();
		
		//select or not select
        WebElement uncheck =  driver.findElement(By.xpath("//*[@id='j_idt87']/div/div[1]/div[2]/div/div")); 
        boolean Status1 = uncheck.isSelected();
       System.out.println(Status1);
       
       WebElement unclick = driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
       if(unclick.isSelected()) {
    	   unclick.click();
       }
	}
}