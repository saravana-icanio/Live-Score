package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiolearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/icanio-10109/Downloads/chromedriver-linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
//		//Selected
//		WebElement Default = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]"));
//        Default.click();
//        
//        WebElement city = driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[2]/div/div[2]"));
//        city.click();
            
        //Select or not select print
        WebElement uncheck =  driver.findElement(By.xpath("//*[@id='j_idt87:console2']/tbody/tr/td[1]/div/div[2]"));
        WebElement uncheck1 = driver.findElement(By.xpath("//*[@id='j_idt87:console2']/tbody/tr/td[2]/div/div[2]"));
        WebElement uncheck2 = driver.findElement(By.xpath("//*[@id='j_idt87:console2']/tbody/tr/td[3]/div/div[2]"));
        WebElement uncheck3 = driver.findElement(By.xpath("//*[@id='j_idt87:console2']/tbody/tr/td[4]/div/div[2]"));

        boolean Status1 = uncheck.isSelected();
        boolean Status2 = uncheck1.isSelected();
        boolean Status3 = uncheck2.isSelected();
        boolean Status4 = uncheck3.isSelected();
        System.out.println(Status1);
        System.out.println(Status2);
        System.out.println(Status3);
        System.out.println(Status4);
////        
        WebElement Default1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]"));
        Default1.click();         
	}
}