package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Greens tech\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("http://automationpractice.com/index.php");
		js.executeScript("window.scrollBy(0,1000)");
		WebElement dress=driver.findElement(By.xpath("//*/div[@class='left-block']/div[@class='product-image-container']/a/img[@title='Printed Chiffon Dress']"));
Actions obj=new Actions(driver);
obj.moveToElement(dress).build().perform();
	}

}
