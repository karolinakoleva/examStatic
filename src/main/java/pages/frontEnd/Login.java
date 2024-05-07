package pages.frontEnd;

import org.openqa.selenium.By;
import pages.base.BasePage;
import utils.WaitTool;

public class Login extends BasePage {

    public Login() {

    }

    private static final By MY_ACCOUNT = By.xpath("(//div[@id='top-links'])//li[2]");
    private static final By LOGIN = By.xpath("//div[@id='top-links']//li[2]//li[2]//a");
    private static final By EMAIL_INPUT = By.id("input-email");
    private static final By PASSWORD_INPUT = By.id("input-password");
    private static final By LOGIN_BUTTON = By.xpath("(//*[@class='btn btn-primary'])[2]");
    private static final By LOGIN_MESSAGE = By.xpath("//*[@class='list-group-item'][1]");

    private static void writeInEmailInputField(String email) {
        writeTextInWebElement(EMAIL_INPUT, email);
    }

    private static void writeInPasswordInputField(String password) {
        writeTextInWebElement(PASSWORD_INPUT, password);
    }

    private static void clickLogin() {
        clickOnWebElementByLocator(LOGIN);
    }

    private static void clickLoginButton() {
        clickOnWebElementByLocator(LOGIN_BUTTON);
    }

    private static void clickMyAccountButton() {
        clickOnWebElementByLocator(MY_ACCOUNT);
    }

    public static String getLoginMessage() {
        WaitTool.waitForElementVisibility(LOGIN_MESSAGE, 10L);
        return driver.findElement(LOGIN_MESSAGE).getText();
    }

    public static void successfulLogin(String email, String password) {
        clickMyAccountButton();
        WaitTool.waitForElementVisibility(LOGIN, 10);
        clickLogin();
        WaitTool.waitForElementVisibility(EMAIL_INPUT, 10);
        writeInEmailInputField(email);
        writeInPasswordInputField(password);
        clickLoginButton();
        WaitTool.waitForElementVisibility(LOGIN_MESSAGE, 10);
    }
}
