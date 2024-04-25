package admin;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.admin.DashboardPage;
import pages.admin.LoginPage;
import pages.base.BasePage;

public class Logout extends LoginPageTest{
    @Test
    public void Logout(){
        LoginPage.goToLoginPage();
        LoginPage.login("admin", "parola123!");
        DashboardPage.logOut();
    }
}
