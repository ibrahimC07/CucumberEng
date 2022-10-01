package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class AppReservationStepDefs {

    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    @Given("user is on the home page")
    public void user_is_on_the_home_page() {

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }
    @And("select a car model {string}")
    public void selectACarModel(String carModel) {
        Select selectCar = new Select(homePage.selectACar);
        selectCar.selectByVisibleText(carModel);
    }
    @Given("enter pick up field")
    public void enter_pick_up_field() {
        homePage.pickUpPlace.sendKeys(Faker.instance(Locale.US).address().city());

    }
    @Given("enter drop off field")
    public void enter_drop_off_field() {
        homePage.dropOffPlace.sendKeys(Faker.instance(Locale.US).address().city());
    }
    @Given("Enter pick up date")
    public void enter_pick_up_date() {
        homePage.pickUpDate.sendKeys("10/12/2062");
        homePage.pickUpTime.sendKeys("11:11pm");
    }
    @Given("Enter drop off date")
    public void enter_drop_off_date() {
        homePage.dropOffDate.sendKeys("11/12/2062");
        homePage.dropOffTime.sendKeys("11:11am");

    }
    @Given("click continue reservation")
    public void click_continue_reservation() {
        homePage.submit.click();

    }
    @Given("verify complete reservation screen pops up")
    public void verify_complete_reservation_screen_pops_up() {
        Assert.assertTrue(homePage.CompleteReservation.isDisplayed());
    }
    @Given("enter card number")
    public void enter_card_number() {

        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Faker.instance().business().creditCardNumber()).perform();

    }
    @Given("enter name on the card")
    public void enter_name_on_the_card() {
        homePage.nameOnCard.sendKeys("John Walker");
    }
    @Given("enter expire date and CVC")
    public void enter_expire_date_and_cvc() {

        actions.sendKeys(Keys.TAB).sendKeys("10/29").perform();
        actions.sendKeys(Keys.TAB).sendKeys("315").perform();

    }
    @Given("checks the agreement")
    public void checks_the_agreement() {
        homePage.contract.click();
    }
    @Given("click complete reservation")
    public void click_complete_reservation() {
        homePage.completeReservationSubmit.click();
    }
    @Then("verify {string} pop up")
    public void verify_pop_up(String string) {
        ReusableMethods.waitFor(1);
        String str = homePage.successfullyText.getText();
        System.out.println("str = " + str);
        Assert.assertEquals(string,str);
    }


}