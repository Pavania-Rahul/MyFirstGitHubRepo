package utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Util {

	public WebDriver driver;
	Actions a;

	public void intilizing(String enterUrl) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(enterUrl);
	}

	public void click(By element) {
		waitUntilIsElementVisible(element);
		driver.findElement(element).click();

	}

	public void sendKeys(By element, String enterValue) {
		waitUntilIsElementVisible(element);
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(enterValue);
	}

	public void selectTheValueUsingTheText(By locator, String enterTextToSelect) {

		waitUntilIsElementVisible(locator);
		try {
			List<WebElement> li = driver.findElements(locator);

			for (int i = 0; i < li.size(); i++) {

				WebElement ele = li.get(i);
				String getTextFromTheElement = ele.getText();

				if (getTextFromTheElement.equalsIgnoreCase(enterTextToSelect)) {
					ele.click();
				} else {
					
					System.out.println("Please check entered text is not available on the page");
				}
			}
		}

		catch (org.openqa.selenium.StaleElementReferenceException e) {
			e.printStackTrace();
		}

	}

	public void waitUntilIsElementVisible(By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}

	public void scrollUntilTheElementIsVisible(By locator) {

		WebElement ele = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}

	public void selectValueFromTheDropDown(By locator, String selectTheText) {

		WebElement ele = driver.findElement(locator);
		Select s = new Select(ele);
		s.deselectByValue(selectTheText);

	}

	public String getValueFromElement(By locator, String nameOfAttributeToGetValue) {
		String ele = driver.findElement(locator).getAttribute(nameOfAttributeToGetValue);
		return ele;
	}

	public String getTextFromTheElement(By locator) {

		WebElement ele = driver.findElement(locator);
		return ele.getText();
	}

	public void selectValueUsingActions(By locator, String enterExpectedValue) {
		WebElement ele = driver.findElement(locator);
		Actions a = new Actions(driver);
	    String getTextFromTheLocator= ele.getText();
	    if(getTextFromTheLocator==enterExpectedValue) {
	    	a.moveToElement(ele).click().perform();
	    }
	}
	
	
	@AfterTest
	public void tear() {
		driver.quit();
	}

}
