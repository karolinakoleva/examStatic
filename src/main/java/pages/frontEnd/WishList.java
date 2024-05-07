package pages.frontEnd;

import org.openqa.selenium.By;
import pages.base.BasePage;
import utils.WaitTool;

public class WishList extends BasePage {

    private static final By IPHONE_LOVE_BUTTON = By.xpath("(//div[@class='button-group'])[2]//button[2]");
    private static final By WISH_LIST = By.linkText("Wish List (1)");
    private static final By MESSAGE_WISHLIST = By.xpath("//*[@id='content']//h2");

    public static String getMessage(){
        WaitTool.waitForElementVisibility(MESSAGE_WISHLIST, 10L);
        return driver.findElement(MESSAGE_WISHLIST).getText();
    }

    public static void wishList() {
        clickOnWebElementByLocator(IPHONE_LOVE_BUTTON);
        WaitTool.waitForElementVisibility(WISH_LIST, 10);
        clickOnWebElementByLocator(WISH_LIST);
        WaitTool.waitForElementVisibility(MESSAGE_WISHLIST, 10);
    }

    public static void iPhoneAddToWishList() {

    }

}
