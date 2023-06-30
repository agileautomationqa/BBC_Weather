package uk.co.bbc.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.bbc.pages.CityWeatherPage;
import uk.co.bbc.pages.WeatherPage;

/**
 * Created by Hiral Yagnik
 * Project Name: BBC_Weather
 */
public class MyStepdefs {
    @Given("I am one BBC weather page")
    public void iAmOneBBCWeatherPage() {
    }
    @When("I enter city name {string} in search bar")
    public void i_enter_city_name_in_search_bar(String string) {
        new WeatherPage().enterCityNameInSearchBar(string);
    }
    @Then("I should see weather result for {string} city")
    public void iShouldSeeWeatherResultForCity(String ExpectedCityName) {
String actualCityname = new CityWeatherPage().getCityName();
        Assert.assertEquals(actualCityname,ExpectedCityName,"Verifying City name is "+ExpectedCityName);
    }

    @And("hightest temp is greater than lowest temp")
    public void hightestTempIsGreaterThanLowestTemp() {
        new CityWeatherPage().clickOnTomorrowDay();
       int highTempCel = new CityWeatherPage().getTomorrowHighTemp();
        int lowTempCel = new CityWeatherPage().getTomorrowLowTemp();
        Assert.assertTrue(highTempCel>lowTempCel,"Verify that tomorrow's high temp is greater than tomorrow's low temp");
    }
}
