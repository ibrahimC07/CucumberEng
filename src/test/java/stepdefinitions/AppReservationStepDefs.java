package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Locale;

public class AppReservationStepDefs {

    HomePage homePage = new HomePage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {

        // Assert.assertTrue(homePage.userID.isDisplayed());
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }

    @And("select a car model {string}")
    public void selectACarModel(String carModel) {
        Select selectCar = new Select(homePage.selectACar);
        //ReusableMethods.selectRandomTextFromDropdown(selectCar);
        selectCar.selectByVisibleText(carModel);
    }

    @Given("enter pick up field")
    public void enter_pick_up_field() {

        homePage.pickUpPlace.sendKeys(Faker.instance(Locale.US).address().cityName());


    }
    @Given("enter drop off field")
    public void enter_drop_off_field() {

        homePage.dropOffPlace.sendKeys(Faker.instance(Locale.US).address().cityName());

    }
    @Given("Enter pick up date")
    public void enter_pick_up_date() {

        homePage.pickUpDate.sendKeys("10/10/2040");
        homePage.pickUpTime.sendKeys("11:11p");

    }
    @Given("Enter drop off date")
    public void enter_drop_off_date() {

        homePage.dropOffDate.sendKeys("10/11/2040");
        homePage.dropOffTime.sendKeys("11:11a");

    }
    @Given("click continue reservation")
    public void click_continue_reservation() {

        homePage.continueReservationButton.click();

    }
    @Given("verify complete reservation screen pops up")
    public void verify_complete_reservation_screen_pops_up() {

        Assert.assertTrue(homePage.completeReservationScreenText.isDisplayed());

    }
    @Given("enter card number")
    public void enter_card_number() {

    }
    @Given("enter name on the card")
    public void enter_name_on_the_card() {

    }
    @Given("enter expire date and CVC")
    public void enter_expire_date_and_cvc() {

    }
    @Given("checks the agreement")
    public void checks_the_agreement() {

    }
    @Given("click complete reservation")
    public void click_complete_reservation() {

    }
    @Then("verify {string} pop up")
    public void verifyPopUp(String arg0) {
    }



}