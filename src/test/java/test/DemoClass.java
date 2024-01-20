package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import methodsfile.MethodsFile;
import properties.PropertiesFile;
import utils.Util;


public class DemoClass {

	MethodsFile method;
	Util util = new Util();

	PropertiesFile p = new PropertiesFile();

	@Test
	public void test() {

		method = new MethodsFile();
		method.launchTheBrowser(p.getValueFromProperties("url"));
		method.enterFirstName(p.getValueFromProperties("userName"));
		method.enterLastName(p.getValueFromProperties("lastName"));
		method.enterAddress(p.getValueFromProperties("address"));
		method.enterMobileNumber(p.getValueFromProperties("mobileNumber"));
		method.enterEmailAddress(p.getValueFromProperties("emailAddress"));
		method.selectTheRadioButton(p.getValueFromProperties("selectRadioButton"));
		method.selectTheCheckBoxValueUsingTheText(p.getValueFromProperties("selctCheckBox"));
		method.selectLanguage(p.getValueFromProperties("selectLanguage"));
		Assert.assertEquals(method.verifySelectedLanguage(),p.getValueFromProperties("selectLanguage"),"Selcted Value is invalid");
		method.selectSkills(p.getValueFromProperties("selectSkills"));
//		method.SelectCountryFromTheDropDown(p.getValueFromProperties("selectCountry"));
//		Assert.assertEquals(method.verifySelectedCountry(),p.getValueFromProperties("selectCountry"),"Selcted Value is invalid");

	}

}
