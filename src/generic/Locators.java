package generic;

public interface Locators {
	
	String firstName = "//input[@ng-model='FirstName']";
	String LastName = "//input[@ng-model='LastName']";
	String Address = "//textarea[@ng-model='Adress']";
	String Email = "//input[@ng-model='EmailAdress']";
	String phone = "//input[@ng-model='Phone']";
	String Gender ="//input[@ng-model='radiovalue' and @value='Male' ]";
	String Language = "//div[@id='msdd']";
	String lang	= "//ul//li//a[@class='ui-corner-all']";
	String Hobbies ="//input[@value='Movies']";
	String skills =" //select[@ng-model='Skill']";
	String country =" //select[@id='countries']";
	String country2 ="//span[@role='presentation']";
	String countrySearch ="//input[@role='textbox']";
	String	year = " //select[@id='yearbox']";
	String	month = " //select[@ng-model='monthbox']";
	String	day = " //select[@id='daybox']";
	String	password = " //input[@id='firstpassword']";
	String	confirmPassword = " //input[@id='secondpassword']";
	String  submit = " //button[@id='submitbtn']";



}
