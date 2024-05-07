package frontEnd;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.frontEnd.Login;
import pages.frontEnd.OpenCart;

public class LoginTest extends BaseTest {
    public LoginTest() {
    }

    @Test
    public void successfulLogin() {
        OpenCart.goToOpenCartPage();
        Login.successfulLogin("karolinakolevaa@abv.bg", "karolina12345");
    }

}
