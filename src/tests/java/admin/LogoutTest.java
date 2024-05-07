package admin;

import org.testng.annotations.Test;
import pages.admin.DashboardPage;
import pages.admin.LoginPage;

public class LogoutTest extends LoginPageTest{
    @Test
    public void Logout(){
        LoginPage.goToLoginPage();
        LoginPage.login("admin", "parola123!");
        DashboardPage.logOut();
    }
}
