package admin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.admin.DashboardPage;
import pages.admin.LoginPage;

public class LogoutTest extends LoginPageTest{
    @Test
    public void Logout(){
        LoginPage.goToLoginPage();
        LoginPage.login("admin", "parola123!");
        DashboardPage.logOut();
        String actualMessage = DashboardPage.getMessage();
        Assert.assertEquals(actualMessage,"Please enter your login details.");
    }
}
