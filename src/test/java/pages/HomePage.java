package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@role='button']")
    public WebElement homeLoginButton;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;


    @FindBy(linkText = "Logout")
    public WebElement logoutLink;


    @FindBy(xpath = "//button[text()='OK']")
    public WebElement OK;

    @FindBy(xpath = "//*[@name='car']")
    public WebElement selectACar;


    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUpPlace;

    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement dropOffPlace;

    @FindBy(xpath = "//input[@name='dropOffDate']")
    public WebElement dropOffDate;

    @FindBy(xpath = "//input[@name='pickUpDate']")
    public WebElement pickUpDate;

    @FindBy(xpath = "//input[@name='pickUpTime']")
    public WebElement pickUpTime;

    @FindBy(xpath = "//input[@name='dropOffTime']")
    public WebElement dropOffTime;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='modal-title h4']")
    public WebElement CompleteReservation;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name='nameOnCard']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//input[@name='expireDate']")
    public WebElement expireDate;


    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//input[@name='contract']")
    public WebElement contract;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[4]")
    public WebElement completeReservationSubmit;

    @FindBy(xpath = "//div[.='Reservation created successfully']")
    public WebElement successfullyText;

    public void clickLoginLink(){
        homeLoginButton.click();

    }
}
// In page object model, we can create important core methods
// For example, in the HomePage, we can create a method that clicks the login link
// This is not must, you can do this in step definitions
// But since this is core function, and we keep calling, we can add this methos here