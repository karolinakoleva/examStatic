package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;
import utils.WaitTool;

public class DashboardPage extends BasePage {
    private static final By USERNAME_LABEL = By.xpath("//*[@id='user-profile']/ ..");
    private static final By LOGOUT_BUTTON = By.cssSelector(".fa.fa-sign-out");

    public DashboardPage() {
    }

    public static String getUsernameText() {
        WaitTool.waitForElementVisibility(USERNAME_LABEL, 10L);
        return driver.findElement(USERNAME_LABEL).getText();
    }

    public static void goToAdminPage() {
        driver.get("https://shop.pragmatic.bg/admin");
    }

    public static void logOut(){

        clickOnWebElementByLocator(LOGOUT_BUTTON);
    }

}
