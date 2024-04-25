package pages.frontEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import utils.WaitTool;

public class OpenCart extends BasePage {
    private static final By CAMERA_BUTTON = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//li[7]");
    private static final String LOGIN_PAGE_URL = "https://shop.pragmatic.bg";
    private static final By NIKON = By.partialLinkText("Nikon D300");
    private static final By ADD_TO_CART_BUTTON = By.id("button-cart");
    private static final By CART_BUTTON = By.id("cart-total");
    private static final By CHECKOUT_BUTTON = By.cssSelector("#cart .fa.fa-share");

    public static void goToOpenCartPage() {
        driver.get("https://shop.pragmatic.bg");
    }

    private static void clickAddToCartButton() {
        clickOnWebElementByLocator(ADD_TO_CART_BUTTON);
    }

    private static void clickCartButton() {
        clickOnWebElementByLocator(CART_BUTTON);
    }

    private static void clickCheckoutButton() {
        clickOnWebElementByLocator(CHECKOUT_BUTTON);
    }

    private static void clickCameraButton() {
        clickOnWebElementByLocator(CAMERA_BUTTON);
    }

    private static void clickNikonCamera() {        clickOnWebElementByLocator(NIKON);    }

    public static void buyCamera() {
        clickCameraButton();
        WaitTool.waitForElementVisibility(NIKON, 10);
        clickNikonCamera();
        WaitTool.waitForElementVisibility(ADD_TO_CART_BUTTON,10);
        clickAddToCartButton();
        clickCartButton();
        WaitTool.waitForElementVisibility(CHECKOUT_BUTTON,10);
        clickCheckoutButton();
    }
}
