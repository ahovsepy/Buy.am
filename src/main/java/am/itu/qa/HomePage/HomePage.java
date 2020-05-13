package am.itu.qa.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.BasePage.BasePage;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public final String SETTINGS = "//i[@class='im-icon-settings']";
	public final String LANGUAGE_BTN = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='language--select']";
	public final String LANGUAGE_ENG = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='language--select']//option[@value='3']";
	public final String LANGUAGE_RUS = "//nav[@class='shop-setings-navigation top-bar--navigation']//select[@class='language--select']//option[@value='4']";
	public final String DROP_BOX_SETTINGS = "//nav[@class='shop-setings-navigation top-bar--navigation']";

	
	@FindBy(xpath = SETTINGS)
	WebElement settings;

	public void clickOnElementSettings() {
		settings.click();
	}

	@FindBy(xpath = LANGUAGE_BTN)
	WebElement language;

	public void clickOnElementLanguage() {
		language.click();
	}

	@FindBy(xpath = LANGUAGE_ENG)
	WebElement language_ENG;

	public HomePage clickOnElementLenguage_ENG() {
		language_ENG.click();
		return new HomePage(this.driver);
	}

	@FindBy(xpath = LANGUAGE_RUS)
	WebElement language_RUS;

	public HomePage clickOnElementLenguage_RUS() {
		language_RUS.click();
		return new HomePage(this.driver);
	}

	@FindBy(xpath=DROP_BOX_SETTINGS)
	WebElement dropBoxSettings;
	
	public boolean dropBoxIsDisplayed() {
		return dropBoxSettings.isDisplayed();
	}
	
	@FindBy(xpath=LANGUAGE_RUS)
	WebElement languageRUS;
	
	public boolean languageRusIsDisplayed() {
		return language_RUS.isSelected();
		}
	
	@FindBy(xpath=LANGUAGE_ENG)
	WebElement languageEng;
	
	public boolean languageEngIsDisplayed() {
		return languageEng.isSelected();
		}
}
