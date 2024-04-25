package admin;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.admin.DashboardPage;
import pages.admin.LoginPage;

public class LoginPageTest extends BaseTest {
    public LoginPageTest() {
    }

    @Test
    public void testSuccessfulLogin() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin", "parola123!");
        String actualUsernameText = DashboardPage.getUsernameText();
        Assert.assertEquals(actualUsernameText, "Milen Strahinski");
    }

    @Test
    public void testSuccessfulLoginWithAdmin1() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin1", "parola123!");
        String actualUsernameText = DashboardPage.getUsernameText();
        Assert.assertEquals(actualUsernameText, "AdminQAC22_First AdminQAC22_Last");
    }
}
