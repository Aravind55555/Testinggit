package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amzonhover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Greens tech\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement menu=driver.findElement(By.id("nav-shop"));
	WebElement menu1=driver.findElement(By.xpath("//span[@aria-label='Echo & Alexa']"));
	
	Actions obj=new Actions(driver);
	obj.moveToElement(menu).build().perform();
	obj.moveToElement(menu1).build().perform();
	
	
	}

}