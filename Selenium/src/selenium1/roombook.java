package selenium1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class roombook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Greens tech\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");
driver.findElement(By.id("username")).sendKeys("AravindKumar");
driver.findElement(By.id("password")).sendKeys("98220141818");
driver.findElement(By.id("login")).click();
Select ob=new Select(driver.findElement(By.id("location")));
ob.selectByVisibleText("Sydney");
String location=ob.getFirstSelectedOption().getText();
System.out.println(location);

Select ob1=new Select(driver.findElement(By.id("hotels")));
ob1.selectByIndex(1);
List<WebElement>option=ob1.getOptions();
for (WebElement e : option) {
	System.out.println(e.getText());
}
Select ob2=new Select(driver.findElement(By.id("room_type")));
ob2.selectByValue("Standard");

Select ob3=new Select(driver.findElement(By.id("room_nos")));
ob3.selectByValue("2");

WebElement date= driver.findElement(By.id("datepick_out"));
date.clear();
date.sendKeys("09/10/2018");

Select ob5=new Select(driver.findElement(By.id("adult_room")));
ob5.selectByValue("2");

Select ob6=new Select(driver.findElement(By.id("child_room")));
ob6.selectByValue("2");

driver.findElement(By.id("Submit")).click();
 driver.findElement(By.id("radiobutton_0")).click(); 
 driver.findElement(By.id("continue")).click(); 
 
 driver.findElement(By.id("first_name")).sendKeys("Aravind");
 driver.findElement(By.id("last_name")).sendKeys("Kumar");
 driver.findElement(By.id("address")).sendKeys("Tuticorin");
 driver.findElement(By.id("cc_num")).sendKeys("12345678901231262");
 
 Select ob7=new Select(driver.findElement(By.id("cc_type")));
 ob7.selectByIndex(2);
 
 Select ob8=new Select(driver.findElement(By.id("cc_exp_month")));
 ob8.selectByIndex(2);
 
 Select ob9=new Select(driver.findElement(By.id("cc_exp_year")));
 ob9.selectByValue("2012");

 driver.findElement(By.id("cc_cvv")).sendKeys("555");
 driver.findElement(By.id("book_now")).click();
 
 WebDriverWait wait=new WebDriverWait(driver, 30);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
 String Order=driver.findElement(By.id("order_no")).getAttribute("value");
 System.out.println(Order);
 
 driver.findElement(By.id("my_itinerary")).click();
 WebElement table=driver.findElement(By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table"));
 List<WebElement>tablerow=table.findElements(By.xpath(".//tr"));
 for(int i=1;i<tablerow.size();i++){
	 WebElement row=tablerow.get(i);
	 String orderno=row.findElement(By.xpath("./td[2]/input")).getAttribute("value");
	
	 if(orderno.equals(Order)){
		 tablerow.get(i).findElement(By.xpath(".//td[1]/input")).click();
		 break;
	 }
 }
 driver.findElement(By.name("cancelall")).click();
 Alert pop=driver.switchTo().alert();
 pop.accept();

	}
} 

