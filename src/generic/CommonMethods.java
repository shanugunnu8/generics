package generic;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public static void sendkeyss(WebDriver driver, String locator, String Text) {
		
		driver.findElement(By.xpath(locator)).sendKeys(Text);
	}
	
	public static void onclick(WebDriver driver, String locator) {

		driver.findElement(By.xpath(locator)).click();
	}
	public static void  select(WebDriver driver, String locator,int index) {
			
		Select Sselect = new Select(driver.findElement(By.xpath(locator)));
		Sselect.selectByIndex(index);
	/* WebElement selecting = driver.findElement(By.xpath(locator));
		List<WebElement> options = selecting.findElements(By.xpath(Locator2));
		  String str1="Hindi";
		  String str2= "English";
		  for(WebElement we1 : lang)
		  {
			  
			  if(we1.equals(str1)|| we1.equals(str2))
			  {
				  we1.click();
			  }
		  }*/
		
				
	}
	public static void multiselect(WebDriver driver, String Locator1,String Locator2) {
		driver.findElement(By.xpath(Locator1)).click();
		  List<WebElement> lang = driver.findElements(By.xpath(Locator2));
		  String str1="Hindi";
		  String str2= "English";
		  for(WebElement we1 : lang)
		  {
			  
			  if(we1.equals(str1)|| we1.equals(str2))
			  {
				  we1.click();
			  }
		  }
		  
		  
	}
	
	public static void selection(WebDriver driver , String locator,String locator2,String Text) 
	{
		driver.findElement(By.xpath(locator)).click();
		driver.findElement(By.xpath(locator2)).sendKeys(Text);
	}
	
	public static void succes(WebDriver driver ,String title)
	{
	 String url = driver.getTitle();	
	 System.out.println(url);
	 if(url.contains(title))
	 {
		 System.out.println("registration successful");
	 }
	 else
	 {
		 System.out.println("not so succesful");
	 }
	}
	
	
}
