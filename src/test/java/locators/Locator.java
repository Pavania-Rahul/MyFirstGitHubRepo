package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Util;

public class Locator extends Util {

	public static By firstName = By.xpath("//input[@placeholder='First Name']");
	public static By lastName = By.xpath("//input[@placeholder='Last Name']");
	public static By address = By.xpath("//*[@ng-model='Adress']");
	public static By emailAddress = By.xpath("//input[@type='email']");
	public static By mobileNumber = By.xpath("//input[@type='tel']");
	public static By radioButton = By.xpath("//input[@type='radio']/..");
	public static By checkBox = By.xpath("//input[@value='<<dynamicValue>>']");
	public static By languages = By.id("msdd");
	public static By languagesText = By.xpath("//label[text()='Languages']");
	public static By listOfLanguage = By.xpath("//ul[contains(@class,'ui-menu')]/li/a");
	public static By languageText = By.xpath("//*[text()='Languages']");
	public static By skillsDropDown = By.id("Skills");
	public static By skillsDropDownOptions = By.xpath("//select[@id='Skills']/option");
	public static By selectedLanguageValue = By.xpath("//div[@class='ui-autocomplete-multiselect-item']");
	public static By selectCountryDropDown=By.xpath("//span[@aria-labelledby='select2-country-container']");
	public static By listOfCountry=By.xpath("//ul[@class='select2-results__options']/li");
	public static By selectedCountry=By.xpath("//span[@aria-labelledby='select2-country-container']/span[1]");
	public static By selectedCountry1=By.xpath("//span[@aria-labelledby='select2-country-container']/span[1]");
}
