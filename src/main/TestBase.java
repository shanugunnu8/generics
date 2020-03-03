package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.CommonMethods;
import generic.Locators;

public class TestBase implements Locators {

	static
	{
		System.setProperty("webdriver.chrome.driver", "../Gen/drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		CommonMethods.sendkeyss(driver, firstName, "Ana");
		CommonMethods comme = new CommonMethods();
		comme.sendkeyss(driver, LastName, "pareek");
		CommonMethods.sendkeyss(driver, Address	, "Bhopal");
		CommonMethods.sendkeyss(driver, Email, "shanugunnu8@gmail.com");
		CommonMethods.sendkeyss(driver, phone, "9874563210");
		CommonMethods.onclick(driver, Gender);
		CommonMethods.onclick(driver, Hobbies);
		CommonMethods.multiselect(driver, Language, lang);
		CommonMethods.select(driver, skills,5);
		CommonMethods.select(driver, country,2);
		CommonMethods.selection(driver, country2,countrySearch, "Australia");
		CommonMethods.select(driver, year, 5);
		CommonMethods.select(driver, month, 5);
		CommonMethods.select(driver, day, 6);
		CommonMethods.sendkeyss(driver, password, "Anamika1");
		CommonMethods.sendkeyss(driver, confirmPassword, "Anamika1");
		CommonMethods.onclick(driver, submit);
		Thread.sleep(3000);
		CommonMethods.succes(driver ,"Web Table");
		driver.close();
		
		

	}

}
