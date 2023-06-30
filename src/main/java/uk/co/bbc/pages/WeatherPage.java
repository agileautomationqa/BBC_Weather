package uk.co.bbc.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.bbc.utility.Utility;

/**
 * Created by Hiral Yagnik
 * Project Name: BBC_Weather
 */
public class WeatherPage extends Utility {
    private static final Logger log = LogManager.getLogger(WeatherPage.class.getName());
    public WeatherPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "ls-c-search__input-label")
    WebElement searchBar;
    @FindBy(xpath = "//button[@title='Search for a location']//*[name()='svg']")
    WebElement searchButton;

    @FindBy(xpath = "//ul[@id='location-list']//li[1]")
    WebElement firstOption;

    public void enterCityNameInSearchBar(String cityName){
      sendTextToElement(searchBar,cityName);
      firstOption.click();


    }
}
