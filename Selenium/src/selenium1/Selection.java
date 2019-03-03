package selenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class Selection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Greens tech\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	

		
	 String beforeXpath = "//*[@id='customers']/tbody/tr/td";
	

	
	List<WebElement> size=driver.findElements(By.xpath(beforeXpath));
	for(WebElement e:size){
		String g="UK";
		if(e.getText().equals(g)){
			System.out.println(g);
			
		}	
	}
	

	
	}
	
	
}






	/*Select ob=new Select(driver.findElement(By.id("location")));
	ob.selectByIndex(1);

	//System.out.println(ob);
	
//	Select ob1=new Select(driver.findElement(By.id("hotels")));
	
	//System.out.println(ob1);
	
//	Select ob2=new Select(driver.findElement(By.id("room_type")));
//	ob2.selectByValue("Deluxe");
//	System.out.println(ob2);

	ArrayList<String>selected=new ArrayList<String>();
String option=ob1.getFirstSelectedOption().getText();
System.out.println(option);	


	


	
	
	
	
	
	
	/*
	List<WebElement>op=ob.getOptions();
	for(int i=0;i<op.size();i++){
  String s=op.get(i).getText();
 
  if(s.equals("Paris")){
	  ob.selectByIndex(i);
	  break;

	  }
*/
  
  