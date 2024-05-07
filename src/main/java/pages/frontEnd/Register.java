package pages.frontEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.admin.DashboardPage;
import pages.base.BasePage;
import utils.WaitTool;

import java.time.Duration;

public class Register extends BasePage {

    private static final By MY_ACCOUNT = By.xpath("(//div[@id='top-links'])//li[2]");
    private static final By REGISTER_BUTTON = By.xpath("(//*[@id=\"top-links\"])//li//li[1]");
    private static final By FIRST_NAME = By.id("input-firstname");
    private static final By LAST_NAME = By.id("input-lastname");
    private static final By EMAIL = By.id("input-email");
    private static final By TELEPHONE = By.id("input-telephone");
    private static final By PASSWORD = By.id("input-password");
    private static final By PASSWORD_CONFIRM = By.id("input-confirm");
    private static final By AGREE_BUTTON = By.name("agree");
    private static final By CONTINUE_BUTTON = By.cssSelector(".btn.btn-primary");
    private static final By ALREADY_REGISTERED_EMAIL_MESSAGE = By.cssSelector(".alert.alert-danger.alert-dismissible");
    private static final By MESSAGE = By.id("content");

    private static void clickMyAccountButton() {
        clickOnWebElementByLocator(MY_ACCOUNT);
    }

    private static void clickRegisterButton() {
        clickOnWebElementByLocator(REGISTER_BUTTON);
    }


    private static void writeInFirstNameInputField(String firstName) {
        writeTextInWebElement(FIRST_NAME, firstName);
    }

    private static void writeInLastNameInputField(String lastName) {
        writeTextInWebElement(LAST_NAME, lastName);
    }


    private static void writeInEmailInputField(String email) {
        writeTextInWebElement(EMAIL, email);
    }

    private static void writeInTelephoneInputField(String telephone) {
        writeTextInWebElement(TELEPHONE, telephone);
    }

    private static void writeInPasswordInputField(String password) {
        writeTextInWebElement(PASSWORD, password);
    }

    private static void writeInPasswordConfirmInputField(String passwordConfirm) {
        writeTextInWebElement(PASSWORD_CONFIRM, passwordConfirm);
    }

    private static void clickAgreeButton() {
        clickOnWebElementByLocator(AGREE_BUTTON);
    }


    private static void clickContinueButton() {
        clickOnWebElementByLocator(CONTINUE_BUTTON);
    }

    public static String getMessage() {
        WaitTool.waitForElementVisibility(MESSAGE, 10L);
        return driver.findElement(MESSAGE).getText();
    }

    public static String getUnsuccessfulMessage() {
        WaitTool.waitForElementVisibility(ALREADY_REGISTERED_EMAIL_MESSAGE, 10);
        return driver.findElement(ALREADY_REGISTERED_EMAIL_MESSAGE).getText();
    }

    public static void successfulRegister(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        clickMyAccountButton();
        WaitTool.waitForElementVisibility(REGISTER_BUTTON, 10);
        clickRegisterButton();
        WaitTool.waitForElementVisibility(FIRST_NAME, 10);
        writeInFirstNameInputField(firstName);
        writeInLastNameInputField(lastName);
        writeInEmailInputField(email);
        writeInTelephoneInputField(telephone);
        writeInPasswordInputField(password);
        writeInPasswordConfirmInputField(passwordConfirm);
        clickAgreeButton();
        clickContinueButton();
        WaitTool.waitForElementVisibility(MESSAGE,10);
    }

    public static void unsuccessfulRegister(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        clickMyAccountButton();
        WaitTool.waitForElementVisibility(REGISTER_BUTTON, 10);
        clickRegisterButton();
        WaitTool.waitForElementVisibility(FIRST_NAME, 10);
        writeInFirstNameInputField(firstName);
        writeInLastNameInputField(lastName);
        writeInEmailInputField(email);
        writeInTelephoneInputField(telephone);
        writeInPasswordInputField(password);
        writeInPasswordConfirmInputField(passwordConfirm);
        clickAgreeButton();
        clickContinueButton();
        WaitTool.waitForElementVisibility(ALREADY_REGISTERED_EMAIL_MESSAGE, 10);
    }
}
