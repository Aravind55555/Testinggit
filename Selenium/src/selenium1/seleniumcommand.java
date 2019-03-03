package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumcommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Greens tech\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		   JavascriptExecutor js = (JavascriptExecutor) driver;

               		
        WebElement Element = driver.findElement(By.id("//*[@id='navFooter']/div[4]/ul/li[1]/a"));

    	
        js.executeScript("arguments[0].scrollIntoView();", Element);

	}
	

}
