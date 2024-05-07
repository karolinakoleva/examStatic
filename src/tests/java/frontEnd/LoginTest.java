package frontEnd;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.frontEnd.Login;
import pages.frontEnd.OpenCart;
import pages.frontEnd.Register;

public class LoginTest extends BaseTest {
    public LoginTest() {
    }

    @Test
    public void successfulLogin() {
        OpenCart.goToOpenCartPage();
        Login.successfulLogin("karolinakolevaa@abv.bg", "karolina12345");
        String actualMessage = Login.getLoginMessage();
        Assert.assertEquals(actualMessage, "My Account");
    }
}
