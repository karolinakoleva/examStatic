package frontEnd;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.frontEnd.OpenCart;
import pages.frontEnd.Register;


public class AlreadyRegisteredEmailAddressTest extends BaseTest {
    public AlreadyRegisteredEmailAddressTest(){

    }
    @Test
    public void notSuccessfulRegister(){
        OpenCart.goToOpenCartPage();
        Register.unsuccessfulRegister("Karolina", "Koleva", "karolinakolevaa@abv.bg","0888888888","karolina12345","karolina12345");
        String actualMessage = Register.getUnsuccessfulMessage();
        Assert.assertEquals(actualMessage, "Warning: E-Mail Address is already registered!");
    }
}
