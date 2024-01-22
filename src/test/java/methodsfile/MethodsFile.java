package methodsfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import locators.Locator;
import utils.Util;

public class MethodsFile extends Util {

	public void launchTheBrowser(String URL) {
		intilizing(URL);
	}

	public void enterFirstName(String firstName) {
		sendKeys(Locator.firstName, firstName);
	}

	public void enterLastName(String lastName) {
		sendKeys(Locator.lastName, lastName);
	}

	public void enterAddress(String enterAddress) {
		sendKeys(Locator.address, enterAddress);
	}

	public void enterEmailAddress(String enterEmailAddress) {

		sendKeys(Locator.emailAddress, enterEmailAddress);
	}

	public void enterMobileNumber(String enterMobileNumber) {

		sendKeys(Locator.mobileNumber, enterMobileNumber);
	}

	public void selectTheRadioButton(String enterTextToSelect) {
		selectTheValueUsingTheText(Locator.radioButton, enterTextToSelect);
	}

	public void selectTheCheckBoxValueUsingTheText(String enterTextToSelect) {
		String checkBox = "//input[@value='<<dynamicValue>>']".replace("<<dynamicValue>>", enterTextToSelect);
		click(By.xpath(checkBox));
	}

	public void selectLanguage(String enterTextToSelect) {
		scrollUntilTheElementIsVisible(Locator.languageText);
		click(Locator.languages);
		selectTheValueUsingTheText(Locator.listOfLanguage, enterTextToSelect);
		click(Locator.languagesText);
	}
	

	public void selectSkills(String enterTextToSelect) {
		click(Locator.skillsDropDown);
		selectTheValueUsingTheText(Locator.skillsDropDownOptions, enterTextToSelect);
		click(Locator.languagesText);
	}
	
	
	public String verifySelectedLanguage() {
		
		return getTextFromTheElement(Locator.selectedLanguageValue);
		
	}
	
	public void SelectCountryFromTheDropDown(String enterTextToSelect){
	    click(Locator.selectCountryDropDown);
		waitUntilIsElementVisible(Locator.listOfCountry);
		scrollUntilTheElementTheTextIsVisible(Locator.listOfCountry, enterTextToSelect);
		selectTheValueUsingTheText(Locator.listOfCountry, enterTextToSelect);
	}
	
public String verifySelectedCountry() {
		
		return getTextFromTheElement(Locator.selectedCountry);
		
	}
	

}
