package selenium1;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Greens tech\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-table/");
	driver.findElement(By.id(""));
	int s=driver.findElements(By.xpath("//*[@class='wf-container-main']//table/thead/tr")).size();
	System.out.println(s);
	//driver.switchTo().frame("iframe_a");
	//driver.findElement(By.id("name")).sendKeys("Aravind");
	//driver.switchTo().defaultContent();
	//driver.findElement(By.linkText("Opens in a new window")).click();
	//Actions obj =new Actions(driver);
	//obj.click(driver.findElement(By.id("username"))).sendKeys("AravindKumar"+Keys.TAB).sendKeys("98220141818"+Keys.TAB).build().perform();
	//driver.findElement(By.id("")).sendKeys("AravindKumar");
	//driver.findElement(By.id("password")).sendKeys("98220141818");
	//driver.findElement(By.id("login")).click();
		}

} 