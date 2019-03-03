package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampletest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Greens tech\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");
		

driver.findElement(By.id("username")).sendKeys("AravindKumar");
driver.findElement(By.id("password")).sendKeys("98220141818");
driver.findElement(By.id("login")).click();

String title=driver.getTitle();
String title1=driver.getCurrentUrl();
System.out.println(title1);
	System.out.println(title);
	if(!(title1.equals("http://adactin.com/HotelApp/SearchHotel.php"))){
		System.out.println("LogIn Success");
	}else{
		System.out.println("Invalid User");
	}
}
}
