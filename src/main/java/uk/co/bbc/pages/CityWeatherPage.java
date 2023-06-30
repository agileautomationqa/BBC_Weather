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
public class CityWeatherPage extends Utility {
    private static final Logger log = LogManager.getLogger(CityWeatherPage.class.getName());
    public CityWeatherPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "wr-location-name-id")
    WebElement cityNameElement;

    @FindBy(xpath = "//li[@data-pos='1']")
    WebElement selectDayTomorrow;

    @FindBy(xpath = "//li[@class='wr-day wr-day--1 wr-js-day  wr-day--active']//div[@class='wr-day-temperature__high']//span[contains(@class,'wr-value--temperature--c')]")
    WebElement tomorrowHighTempElement;

    @FindBy(xpath = "//li[@class='wr-day wr-day--1 wr-js-day  wr-day--active']//div[@class='wr-day-temperature__low']//span[contains(@class,'wr-value--temperature--c')]")
    WebElement tomorrowLowTempElement;
    public String  getCityName()
    {
       // System.out.println(getTextFromElement(cityNameElement));
        return getTextFromElement(cityNameElement);
    }
    public void clickOnTomorrowDay(){
        clickOnElement(selectDayTomorrow);
    }
    public int getTomorrowHighTemp(){
        return Integer.parseInt(getTextFromElement(tomorrowHighTempElement).replaceAll("°",""));

    }
    public int getTomorrowLowTemp(){
        return Integer.parseInt(getTextFromElement(tomorrowLowTempElement).replaceAll("°",""));
    }
}
