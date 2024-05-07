package frontEnd;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.frontEnd.Login;
import pages.frontEnd.OpenCart;
import pages.frontEnd.WishList;

public class AddToWishListTest extends BaseTest {
    public AddToWishListTest(){
    }
    @Test
    public void iPhoneAddToWishList(){
        OpenCart.goToOpenCartPage();
        Login.successfulLogin("karolinakolevaa@abv.bg", "karolina12345");
        OpenCart.goToOpenCartPage();
        WishList.wishList();
        String actualMessage = WishList.getMessage();
        Assert.assertEquals(actualMessage, "My Wish List");
    }
}
