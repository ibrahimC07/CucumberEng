package stepdefinitions;

import io.cucumber.java.en.*;
import pages.MedunnaHomePage;

public class MedunnaStepDefs {
    MedunnaHomePage medunnaHomePage=new MedunnaHomePage();
    @Given("Sign in as Admin with username {string} and password {string}")
    public void sign_in_as_admin_with_username_and_password(String username, String password) {
        medunnaHomePage.signInIcon.click();
        medunnaHomePage.signInButton.click();
        medunnaHomePage.username.sendKeys(username);
        medunnaHomePage.password.sendKeys(password);
        medunnaHomePage.submit.click();


    }
    @When("Click on Items&Titles button")
    public void click_on_items_titles_button() {

    }
    @When("Click on Room button")
    public void click_on_room_button() {

    }
    @When("Click on Create a new Room button")
    public void click_on_create_a_new_room_button() {

    }
    @Then("Verify Create or edit a Room text")
    public void verify_create_or_edit_a_room_text() {

    }
    @When("Enter the room number as {string} in the room number box")
    public void enter_the_room_number_as_in_the_room_number_box(String string) {

    }
    @When("Clear the room number")
    public void clear_the_room_number() {

    }
    @When("Click on Room Type dropdown")
    public void click_on_room_type_dropdown() {

    }
    @Then("Verify This field is required.")
    public void verify_this_field_is_required() {

    }
    @Then("Verify {int} room types exist in Room Type dropdown")
    public void verify_room_types_exist_in_room_type_dropdown(Integer int1) {

    }
    @When("Click on Status Checkbox")
    public void click_on_status_checkbox() {

    }
    @Then("Verify that checkbox is selected")
    public void verify_that_checkbox_is_selected() {

    }
    @When("Send price as {string} to price box")
    public void send_price_as_to_price_box(String string) {

    }
    @When("Clear the price box")
    public void clear_the_price_box() {

    }
    @When("Click on Description box")
    public void click_on_description_box() {

    }
    @When("Send description as {string} to the Description box")
    public void send_description_as_to_the_description_box(String string) {

    }
    @When("Clear the Description box")
    public void clear_the_description_box() {

    }
    @When("Click on price")
    public void click_on_price() {

    }
    @Then("Verify that This field is required is not displayed")
    public void verify_that_this_field_is_required_is_not_displayed() {

    }
    @When("Click on first view button")
    public void click_on_first_view_button() {

    }
    @Then("Verify Room header")
    public void verify_room_header() {

    }
    @When("Click on back button")
    public void click_on_back_button() {

    }
    @Then("Verify there are {int} view buttons")
    public void verify_there_are_view_buttons(Integer int1) {

    }
    @When("Click on Edit Button")
    public void click_on_edit_button() {

    }
    @When("Change the Description")
    public void change_the_description() {

    }
    @When("Click on save button")
    public void click_on_save_button() {

    }
    @Then("Verify The room is updated.")
    public void verify_the_room_is_updated() {

    }
    @When("Click on Created Date to sort rooms from newest to oldest")
    public void click_on_created_date_to_sort_rooms_from_newest_to_oldest() {

    }
    @When("Click on first delete button")
    public void click_on_first_delete_button() {

    }
    @When("Click on Delete button on alert")
    public void click_on_delete_button_on_alert() {

    }
    @Then("Verify A room is Deleted message")
    public void verify_a_room_is_deleted_message() {

    }
}
